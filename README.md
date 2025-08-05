# 📚 Junit-multiply-test — Java Arithmetic & Multiplication Project with Unit Testing

A clean, test-driven **Java 22 Maven project** showcasing basic arithmetic operations using **TDD (Test-Driven Development)** principles with **JUnit 4**.

 This project demonstrates how to structure unit tests for basic mathematical operations like addition and multiplication using `junit.framework.TestCase`.

---


## 🔧 Technologies Used

| Tool/Framework         | Version           | Description                              |
|------------------------|-------------------|------------------------------------------|
| Java                   | 22                | Programming language                     |
| Maven                  | 3.9+              | Build & Dependency Management            |
| JUnit                  | 4.12              | Unit Testing Framework                   |
| Exec Maven Plugin      | 3.1.0             | Run Java classes from Maven              |

---


## 🎯 Features

- ✅ Addition of integers
- ✅ Multiplication of integers
- ✅ Extensive test coverage with:
  - Positive numbers
  - Negative numbers
  - Mixed signs
  - Zero values
- 🚫 No reliance on `main()` for logic verification — all tested with JUnit


## 🗂️ Project Structure


MavenProj/
├── pom.xml
├── src/
│ ├── main/
│ │ └── java/com/nt/source/
│ │ ├── Arithematic.java
│ │ └── Multiply.java
│ └── test/
│ └── java/com/nt/source/
│ ├── AppTest.java (Tests Arithematic)
│ └── AppTest2.java (Tests Multiply)

<img width="800" height="864" alt="image" src="https://github.com/user-attachments/assets/b0e09c04-5e64-43f2-841d-85a43b55281a" />

---


## 📦 Maven Build Setup


### `pom.xml` 


- ✅ Java 22 compatibility
- ✅ JUnit 4 dependency
- ✅ `exec-maven-plugin` to run `Arithematic` from Maven


```xml

<properties>
    <maven.compiler.source>22</maven.compiler.source>
    <maven.compiler.target>22</maven.compiler.target>
</properties>

<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.platform</groupId>
        <artifactId>junit-platform-commons</artifactId>
        <version>1.12.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>

---

💡 Code Overview
Arithematic.java

public class Arithematic {
    public int add(int x, int y) {
        return x + y;
    }
}

Multiply.java

public class Multiply {
    public int multiply(int a, int b) {
        return a * b;
    }
}

---


🧪 Test Cases


✅ AppTest.java – Tests for Arithematic

Method	Test Description
testSumWithPositive()	Addition with two positive integers
testSumWithNegativeNumber()	Addition with two negative integers
testSumWithMixedNumber()	Addition with positive and negative
testSumWithZeros()	Addition with zeros

✅ AppTest2.java – Tests for Multiply

Method	Test Description
testMultiplyWithPositiveNumber()	Multiplication with two positives
testMultiplyWithZero()	Multiplication involving zero
testMultiplyWithNegative()	Multiplication of two negative numbers
testMultiplyWithMixed()	Multiplication of positive & negative

---

✅ Sample Test Output

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.nt.source.AppTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

Running com.nt.source.AppTest2
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS


-----
###  Test Cases Result

<img width="1695" height="421" alt="image" src="https://github.com/user-attachments/assets/93bf7c49-4884-4af7-871c-ccf385c5ee06" />

---


🧼 Best Practices Followed


❌ No business logic in main() methods.

✅ Proper class structure & naming conventions.

✅ Edge case testing.

🧪 Pure JUnit-based testing with assertions.

🔁 TDD-friendly development process.

----


📚 Learning Outcomes

Understand how to test individual units of logic in Java

Learn how to structure a Maven project

Learn how to use junit.framework.TestCase

Gain hands-on experience with Maven plugins

-----


## 👨‍💻 Author

**Muhammad Mutee Haider**  
Java | Spring | Spring Boot | Maven | JUnit  
📧 mutee.dev@gmail.com  
🌐 [LinkedIn](https://www.linkedin.com/in/muhammad-mutee-haider-21a910369) • [GitHub](https://github.com/mutee-haider)


---

🙌 Contributions
Contributions, suggestions, and feedback are welcome!

Feel free to work the project, make improvements, and submit a PR 🚀



