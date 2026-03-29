# OrderManager

## Description
Correction et optimisation d'une application de gestion de commande en utilisant les principes SOLID en Java

## Architecture
```
src/
├── Main.java                          # Client — instancie OrderManager
│
├── Order/
│   ├── Order.java                     # Modèle (amount, items)
│   ├── OrderManager.java              # Contexte — orchestre les strategies
│   └── OrderValidator.java            # Validation de la commande
│
├── Factory/
│   ├── ClientFactory.java
│   ├── TaxFactory.java
│   ├── DatabaseFactory.java
│   └── NotificationFactory.java
│
├── DiscountStrategy/
│   ├── Client.java                    # Interface
│   ├── VIPClient.java
│   ├── NormalClient.java
│   └── NewClient.java
│
├── TaxStrategy/
│   ├── Tax.java                       # Interface
│   ├── NationalTax.java
│   └── InternationalTax.java
│
├── DatabaseStrategy/
│   ├── Database.java                  # Interface
│   └── MySQL.java
│
├── NotificationStrategy/
│   ├── Notification.java              # Interface
│   ├── Email.java
│   ├── SMS.java
│   └── Push.java
│
├── Enum/
│   ├── ClientType.java
│   ├── TaxRate.java
│   ├── DatabaseType.java
│   └── NotificationType.java
│
└── Exceptions/
    ├── ItemsException.java
    └── AmountException.java
```