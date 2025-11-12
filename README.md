# 🧩 QA Automation Assignment — HelloBooks 
> **Repository:** `QA-Automation-Assignment-HelloBooks`  
> **AUT (UAT):** [https://dev.hellobooks.ai](https://dev.hellobooks.ai)  
> **Scope:** Login & Signup / Onboarding

---

## 📘 Overview
This repository contains the **end-to-end QA Automation project** for [**HelloBooks.ai**](https://dev.hellobooks.ai) — a finance/accounting SaaS platform.  
The assignment focuses on testing and automating the **Login** and **Signup (Onboarding)** user flows.

The project demonstrates a full QA lifecycle:
> **Test Planning → Manual Test Design → Automation (Selenium + Java + TestNG + POM) → Reporting (Allure, TestNG, Extent) → Documentation**

---

## ✅ Deliverables (As per assignment requirements)

| # | Deliverable | Description | Status |
|---|--------------|--------------|--------|
| 1 | Test Case Document | 25 test cases (Login + Signup) | ✅ Completed |
| 2 | Automation Suite | 7 automated high-priority P1 test cases using Selenium + TestNG (POM) | ✅ Completed |
| 3 | Execution Reports | Allure Report, TestNG HTML, Extent Report | ✅ Generated |
| 4 | README | Project setup, OTP handling note, and report documentation | ✅ This file |
| 5 | Defect Log | Documented defects during manual/automation testing | ✅ Included |

---


## 🧪 Automated Test Scenarios (7 Total)

| # | Test Case | Module | Priority | Type |
|---|------------|----------|-----------|--------|
| 1 | Signup – Happy Path (OTP Mocked) | Signup | P1 | Positive |
| 2 | Signup – Required Field Validation | Signup | P1 | Negative |
| 3 | Signup – Invalid Email Format | Signup | P1 | Negative |
| 4 | Signup – Weak Password | Signup | P1 | Negative |
| 5 | Login – Valid Login + Logout | Login | P1 | Positive |
| 6 | Login – Invalid Password | Login | P1 | Negative |
| 7 | Login – Unregistered Email | Login | P1 | Negative |

---

## ⚙️ Test Environment & Configuration

| Parameter | Details |
|------------|----------|
| Application URL | [https://dev.hellobooks.ai](https://dev.hellobooks.ai) |
| Browser | Chrome (Latest) |
| Language | Java |
| Framework | Selenium WebDriver + TestNG |
| Build Tool | Maven |
| Design Pattern | Page Object Model (POM) |
| Reports | Allure + TestNG HTML + Extent |
| Wait Mechanism | Explicit Waits (WebDriverWait) |
| Data | Dynamic emails — `qa.automation+<timestamp>@example.com` |

---

## 🔒 OTP Verification — Honest Explanation & Handling

> ⚠️ **Important Transparency Note**

During Signup automation, OTP verification was required.  
HelloBooks’ test environment blocks real OTP emails from disposable domains and doesn’t provide a backend mock endpoint.  
Because of this, **OTP verification could not be bypassed or mocked programmatically**.

### ✅ What was done:
- In **manual testing**, OTP was entered manually to verify that the flow works.
- In **automation**, the OTP step was **mocked/skipped** to allow test completion up to the onboarding redirect step.
- The automated “Signup – Happy Path” test is intentionally **marked as skipped** (via `SkipException`) to maintain integrity and avoid false passes.

> The automated *Signup — Happy Path* test stops at the OTP step and does **not** reach the dashboard because OTP verification could not be bypassed/mocked in the test environment.  

---

## 🧰 Tools & Frameworks Used

| Category | Tool |
|-----------|------|
| Language | Java |
| Test Framework | TestNG |
| Automation | Selenium WebDriver |
| Build Tool | Maven |
| Pattern | Page Object Model (POM) |
| Reporting | Allure, TestNG HTML, ExtentReports |
| Assertion | TestNG `Assert` |

---

## 📁 Project Structure
QA-Automation-Assignment-HelloBooks/<br>
│<br>
├── /Test Case Document//<br>
│ └── TestCase_Document.xlsx/<br>
│<br>
├── /Automation_Suite//<br>
├── src/<br>
│ ├── main/java/<br>
│ │ ├── base/<br>
│ │ │ └── BaseTest.java<br>
│ │ │<br>
│ │ ├── pages/<br>
│ │ │ ├── SignUpPage.java<br>
│ │ │ ├── LoginPage.java<br>
│ │<br>
│ └── test/java/<br>
│ ├── tests/<br>
│ │ ├── SignUpTest.java<br>
│ │ ├── LoginTest.java<br>
│ │<br>
│ └── listeners/<br>
│ └── BaseListener.java<br>
│ ├── pom.xml/<br>
│ └── testng.xml/<br>
│<br>
├── /Execution Reports//<br>
│ ├── testng-results.html/<br>
│ ├── extent-report.html/<br>
│ └── /allure-report//<br>
│<br>
├── /Defect_Log//<br>
│ └── Defect_Log_Document.xlsx/<br>
│/<br>
└── README.md/<br>
└── /All Screenshots//<br>

---

## 🧾 Reports & Evidence

This project includes three reporting formats generated after automation execution.

| Report Type | Framework | Description |
|--------------|------------|--------------|
| 🧩 Allure Report | Allure + TestNG | Step-by-step test documentation with severity, story, and screenshots |
| 🧾 TestNG HTML Report | Default TestNG | Execution summary, class-level details |
| 📈 Extent Report | ExtentReports | Graphical dashboard with pass/fail statistics |

### 📊 Visual Proofs (Screenshots Attached)

### 🧩 Allure Report Dashboard
![Allure Report Dashboard](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Allure%20Report%20Dashboard.png)

### 🧩 Allure Report Graph
![Allure Report Graph](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Allure%20Report%20Graphs.png)

### 🧩 Allure Report Severity
![Allure Report Severity](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Allure%20Report%20Severity.png)

### 🧩 Allure Report Duration
![Allure Report Duration](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Allure%20Report%20Duration%20Graph.png)

### 🧩 Allure Report Behaviour
![Allure Behaviour](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Allure%20Report%20Behaviour.png)

### 🧩 Allure Report Categories
![Allure Categories](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Allure%20Report%20Categories%20.png)

### 🧩 Allure Report Package
![Allure Package](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Allure%20Report%20Packages.png)

### 🧩 Allure Report Status
![Allure Status](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Allure%20Report%20Status.png)

### 🧩 Allure Report Suite
![Allure Suite](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Allure%20Report%20Suites.png)

### 🧩 Extent Report Dashboard
![Extent Dashboard](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Extent%20Report%20Dashboard.png)

### 🧩 Extent Report Failed Test
![Extent Report Failed Test](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Extent%20Report%20Failed%20Test.png)

### 🧩 Extent Report Log
![Extent Logs](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Extent%20Report%20Logs%20and%20Event.png)

### 🧩 Extent Report System
![Extent System](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Extent%20Report%20System%20Details.png)

### 🧩 Extent Report Test Details
![Extent Report Test Deatils](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Extent%20Report%20Test%20Details.png)

### 🧩 Extent Report Test Summary
![Extent Summary](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Extent%20Report%20Test%20Summary.png)

### 🧩 Extent Report Timeline
![Extent Timeline](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/Extent%20Report%20Timeline.png)

### 🧩 IntelliJ Idea Output
![IntelliJ Idea Output](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/IntelliJ%20Idea%20Output.png)

### 🧩 TestNG HTML Report
![Testng html report](https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks/blob/592614fad43c46a0c2874679e0dc4e4ada7e3684/All%20Screenshots/TestNG%20HTML%20Report.png)

> *Reports are generated locally; screenshots are attached for verification.*

---


## 🧩 Allure Report Execution Commands

```bash
# Step 1: Run Test Suite
mvn clean test

# Step 2: Generate Allure Report
allure generate allure-results --clean -o allure-report

# Step 3: Serve Report Locally
allure serve allure-results
```

---

### :gear: How to Run the Project

#### **1. Clone the Repository**
```bash
git clone https://github.com/Code-By-Adarsh/QA-Automation-Assignment-HelloBooks.git
```
#### **2. Open it in IntelliJ Idea and other IDE's**
#### **3. Download Mvn and Allure**
#### **4. Set that in System variable**
#### **5. Run in IDE's through testng.xml**
#### **6. Give command in CLI**
```bash
allure serve allure-results
```

---

## :handshake: Author

Adarsh Jayprakash Mishra<br>
