# jpa_jakarta_onetable_v2.pdf

## Task1

![alt text](image.png)

## Task2

```java
    public void getDevice(int id) {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            
            Device device = em.find(Device.class, id);
            System.out.println(device);
            
            em.getTransaction().commit();
            em.close();
        }
```

![alt text](image-1.png)

## Task3

```java
    public boolean updateDeviceDescription(int id, String description) {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            
            Device device = em.find(Device.class, id);
            if (device == null) {
                em.getTransaction().commit();
                em.close();
                return false;
            }
            
            Device newDevice = new Device(description);
            newDevice.setDeviceId(device.getDeviceId());
            
            em.merge(newDevice);
            em.getTransaction().commit();
            em.close();

            return true;
        }
```

![alt text](image-3.png)

![alt text](image-2.png)

## Task4

```java
    @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name="deviceId", nullable=false)
        private int deviceId;
```

## Task5

```java
        public void deleteDevice(int id) {
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            
            Device device = em.find(Device.class, id);
            if (device != null) {
                em.remove(device);
            }
            
            em.getTransaction().commit();
            em.close();
        }
```

![alt text](image-4.png)
