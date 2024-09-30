package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import entity.*;

public class Dao {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Harj1PU");

	public void createAccount(Account account) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		em.close();
	}

	public Account getAccount(int number) {
		EntityManager em = emf.createEntityManager();
		Account account = em.find(Account.class, number);
		em.close();
		return account;
	}

	// With optimistic locking
	public boolean transfer(int sourceAccountNumber, int destinationAccountNumber, double amount) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Account sourceAccount = em.find(Account.class, sourceAccountNumber);
		Account destinationAccount = em.find(Account.class, destinationAccountNumber);

		// Check if source account has enough balance
		if (sourceAccount.getBalance() < amount) {
			em.getTransaction().rollback();
			em.close();
			return false;
		}

		// Transfer amount
		sourceAccount.setBalance(sourceAccount.getBalance() - amount);
		destinationAccount.setBalance(destinationAccount.getBalance() + amount);

		em.getTransaction().commit();
		em.close();
		return true;
	}
}
