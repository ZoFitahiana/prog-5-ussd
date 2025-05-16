# USSD Orange Madagascar - Interactive Menu `#144#`

## Overview

This project is a Java Spring Boot application that simulates a USSD menu for the **Orange Madagascar** operator, accessible via the code `#144#`.  
It allows users to navigate through an interactive menu similar to those available on mobile phones via USSD, enabling operations such as transfers, bundle purchases, payments, and more.

---

## Menu Structure

Below is an overview of the main categories in the USSD menu:

1. **Money Transfer**
2. **Orange Services** (internet bundles, credit, illimix)
3. **Payments & Partners** (JIRAMA, Canal+, etc.)
4. **Financial Services** (M-Kajy, insurance, loans)
5. **My Account** (balance, statements, PIN code)
6. **VISA Akory Card** (request, activation, top-up)
7. **Karama Account** (open, consult)
8. **Cash Withdrawal** (withdrawal points, codes)

---

## Naming Conventions

The code follows standard Java naming conventions:

| Element               | Convention             | Example                                 |
|----------------------|-------------------------|-----------------------------------------|
| **Class**            | PascalCase              | `UssdApplication`, `MenuHandler`        |
| **Method**           | camelCase               | `createMainMenu()`, `handleUserInput()` |
| **Local Variable**   | camelCase               | `menuList`, `scanner`, `selectedOption` |
| **Package**          | Reverse domain name     | `com.orange.ussd`                       |

---

## Code Formatting & Linting with Spotless

The project uses **[Spotless](https://github.com/diffplug/spotless)** to ensure consistent formatting and style.

### Formatter and Style Guide

- **Formatter used:** `google-java-format`
- **Lint/Style tool:** Spotless Maven plugin

---

## Git Integration

### Pre-Commit Hook (Local)

A Git pre-commit hook is available to automatically format code before committing.

```bash
#!/bin/sh
echo "Running spotless:apply before commit..."
./mvnw spotless:apply

echo "Adding formatted files to commit..."
git add .

echo "Done running spotless:apply"
````

> Save this as `.git/hooks/pre-commit` and run `chmod +x .git/hooks/pre-commit`.

### Manual Formatting and Check

* **Format code manually:**

  ```bash
  ./mvnw spotless:apply
  ```

* **Check for style/lint errors:**

  ```bash
  ./mvnw spotless:check
  ```

---

## Continuous Integration (CI)

We use **GitHub Actions** to automatically run lint checks on every push or pull request targeting the `main` branch.

### CI Workflow Example

```yaml
name: CI - Lint Java Code

on:
  push:
    branches: [ main ]
  pull_request:
    branches: [ main ]

jobs:
  lint:
    name: Lint with Spotless
    runs-on: ubuntu-latest

    steps:
      - name: Checkout code
        uses: actions/checkout@v3

      - name: Setup Java 17
        uses: actions/setup-java@v3
        with:
          distribution: 'temurin'
          java-version: '17'

      - name: Run Spotless (Lint Check)
        run: mvn spotless:check
```

---

## Running the Application

### Requirements

* Java 17 or higher
* Maven
* Terminal or command prompt

## Sample USSD Navigation

```text
Main Menu:
1. Money Transfer
2. Orange Services
3. Payments & Partners
...

Your choice: 1

Transfer to:
1. Orange Money
2. Airtel Money
...
```

---

## Contribution Guidelines

* Ensure your code passes `spotless:check` before committing or pushing.
* Prefer using the Git pre-commit hook to automatically format your code.
* CI checks will fail if code formatting does not follow the rules.

