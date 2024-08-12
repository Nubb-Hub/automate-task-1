# Automate-task-1</h1>
Task from MQA course to login and verify using java with maven


## 📃 Script Instruction
```
1. open : https://tutorialsninja.com/demo/index.php
2. click My Account -> Login
```
   ![image](https://github.com/user-attachments/assets/56349585-0b62-4fb6-8843-8ea2c4ce8868 )
```
3. input email : hilibrikateu-4757@yopmail.com
4. password : 123456
5. click Login
6. verify with one of the texts on the following page
```
   ![image](https://github.com/user-attachments/assets/36221b34-b8ba-43e7-80ce-8c54d347937e)
   
## 📦 Features
<code>► The script run using edgedriver, make sure you have edge browser installed on your system </code>

## 📂 Repository Structure
```sh
└── automate-task-1/
    ├── pom.xml
    └── src
        └── test
            └── java
                └── org
```
## 🧩 Modules

<details closed><summary>POM.xml</summary>

| File                                                                          | Summary                              |
| ---                                                                           | ---                                  |
| [pom.xml](https://github.com/Nubb-Hub/automate-task-1/blob/master/pom.xml) | <code>► File to put depedency</code> |

</details>

<details closed><summary>src.test.java.org</summary>

| File                                                                                                                | Summary                                      |
| ---                                                                                                                 | ---                                          |
| [verifyMyAccount.java](https://github.com/Nubb-Hub/automate-task-1/blob/master/src/test/java/org/verifyMyAccount.java) | <code>► File to write automation code</code> |

</details>

## 🚀 Getting Started

***Requirements***

Ensure you have the following dependencies installed on your system:

* **Java**: `version 11.0.21`
* **Maven**: `version 3.9.6` 

## ⚙️ Installation
1. Clone the automate-task-1 repository:

```sh
git clone https://github.com/Nubb-Hub/automate-task-1
```

2. Change to the project directory:

```sh
cd automate-task-1
```

3. Install the dependencies:

```sh
mvn clean install
```

### 🤖 Running automate-task-1

Use the following command to run automate-task-1:

```sh
mvn test -Dtest=verifyMyAccount
```

### 🧪 Tests

To execute tests, run:

```sh
mvn test
```

---
