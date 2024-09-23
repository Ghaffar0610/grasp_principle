# GRASP Principles in Software Design

Welcome to the **GRASP Principles** repository! This project demonstrates key GRASP principles, particularly focusing on **Protected Variations**.

## Table of Contents

- [Introduction](#introduction)
- [Protected Variations](#protected-variations)
- [Unprotected Version](#unprotected-version)
- [Protected Version](#protected-version)
- [Installation](#installation)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This repository contains examples that showcase various GRASP principles in object-oriented design. The key focus is on **Protected Variations**, which ensures that parts of a system are shielded from changes in other parts by using abstraction.

The key GRASP principles include:
1. **Information Expert**
2. **Creator**
3. **Controller**
4. **Low Coupling**
5. **High Cohesion**
6. **Polymorphism**
7. **Indirection**
8. **Protected Variations**

## Principles Covered

1. **Information Expert**: Assign responsibility to the class that has the information necessary to fulfill it.
2. **Creator**: Assign responsibility for creating an instance of a class to another class that has the information needed.
3. **Controller**: Assign responsibility to a class that handles system events and coordinates the work between other classes.
4. **Low Coupling**: Minimize dependencies between classes to enhance flexibility and maintainability.
5. **High Cohesion**: Ensure that a class or module focuses on a single responsibility or closely related tasks.
6. **Polymorphism**: Use inheritance or interfaces to handle variations in behavior.
7. **Indirection**: Introduce an intermediary object to decouple two components.
8. **Protected Variations**: Protect elements of a system from the variations in other elements by encapsulating the unstable components.

## Usage

Clone the repository and explore the code for each GRASP principle. Each folder contains examples that showcase how to implement the principles in Java.

## Protected Variations

In software design, **Protected Variations** is used to prevent changes in one part of a system from impacting another. This is achieved by introducing an abstraction layer, allowing you to add or modify functionality without changing the core system.

### Example: Payment Processing

The following example demonstrates how to protect a `Checkout` system from changes in payment methods by using the **PaymentStrategy** interface.

## Unprotected Version

In this version, the `Checkout` class directly handles different payment methods, leading to tight coupling and reduced flexibility:

```java
class Checkout {
    public void completePaymentWithCreditCard(double amount) {
        System.out.println("Paid with credit card: $" + amount);
    }

    public void completePaymentWithPayPal(double amount) {
        System.out.println("Paid with PayPal: $" + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.completePaymentWithCreditCard(100.00);  // Pays $100 with Credit Card
        checkout.completePaymentWithPayPal(250.00);      // Pays $250 with PayPal
    }
}


This version of the `README.md` keeps the explanation simple and demonstrates the difference between the unprotected and protected versions clearly, making it easy for viewers to understand the benefits of applying the **Protected Variations** principle.
