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


### 🧾 Included in README (Honesty Note to Recruiters)
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
│ ├── /src//<br>
│ │ ├── /base//<br>
| | └──BaseTest.java<br>
│ │ ├── /pages//<br>
| | └──SignUpPage.java<br>
| | └──LoginPage.java<br>
│ │ └── /tests//<br>
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
