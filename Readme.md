Addressing SOLID Principles
This repository demonstrates the application of three key SOLID principles—Single Responsibility Principle (SRP), Open-Closed Principle (OCP), and Liskov Substitution Principle (LSP). Each principle is illustrated with violated and solved examples using realistic use cases to showcase the importance of adhering to these principles in software design.

Principles Addressed
1. Single Responsibility Principle (SRP)
Definition: A class should have only one reason to change, meaning it should handle only one responsibility.
Use Case: A Library Management System managing both book-related operations and notifications.
Violation: The LibraryManager class managed both responsibilities.
Solution: Split responsibilities into BookManager for books and NotificationService for notifications.
2. Open-Closed Principle (OCP)
Definition: Software entities should be open for extension but closed for modification.
Use Case: A Payment Processing System handling multiple payment methods like Credit Card and PayPal.
Violation: The PaymentProcessor class required modification for every new payment method.
Solution: Introduced an abstract Payment class and concrete classes (CreditCardPayment, PayPalPayment) for each payment type.
3. Liskov Substitution Principle (LSP)
Definition: Subtypes must be substitutable for their base types without altering program behavior.
Use Case: A Shape Calculation System with Rectangle and Square.
Violation: The Square class altered the behavior of Rectangle by modifying width and height properties.
Solution: Introduced a base Shape class and redefined Rectangle and Square to ensure LSP compliance.


How to Run the Code
Clone the Repository
bash
Copy code
git clone <repository-link>
Navigate to the Desired Folder
bash
Copy code
cd Addressing_SOLID_Principles/Solved/
Compile and Run the Code
bash
Copy code
javac *.java
java Main
Conclusion
Adhering to SOLID principles ensures:

SRP: Simplifies code by assigning distinct responsibilities to each class.
OCP: Enhances flexibility by allowing new functionality without modifying existing code.
LSP: Promotes robust polymorphism by ensuring subclasses can replace their parent classes seamlessly.
This repository showcases how following SOLID principles leads to maintainable, scalable, and efficient software systems.
