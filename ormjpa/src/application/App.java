package application;

import entity.*;
import dao.*;

public class App {


	public static void initDB(Dao dao) {
        
        // initialize db
        System.out.println("Initializing database...");

        // Create accounts
		Account account1 = Account.builder().number(1).balance(100.0).build();
		Account account2 = Account.builder().number(2).balance(200.0).build();
		Account account3 = Account.builder().number(3).balance(300.0).build();

		dao.createAccount(account1);
		dao.createAccount(account2);
		dao.createAccount(account3);

		System.out.println("Database initialized.");
    }
	
    public static void main(String[] args) {
    	
    	Dao dao = new Dao();
    	initDB(dao);

		Account acc1 = dao.getAccount(1);
		Account acc2 = dao.getAccount(2);

		System.out.println("Account 1: " + acc1);
		System.out.println("Account 2: " + acc2);

		dao.transfer(1, 2, 50.0);

		acc1 = dao.getAccount(1);
		acc2 = dao.getAccount(2);

		System.out.println("Account 1: " + acc1);
		System.out.println("Account 2: " + acc2);
    }
}

