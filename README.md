# Spring Boot Tekbook — Starter Project for Lab 07

This repository is the **starter Spring Boot application** used in:

**Séance 7 — Pipeline complexe avec GitLab CI/CD**
- Spring Boot Java
- GitLab CI/CD
- Docker / GitLab Container Registry
- AWS EC2 deployment

## What is already provided

- Spring Boot application
- Maven build
- Unit test
- `/api/hello` endpoint
- `/actuator/health` endpoint
- Multi-stage Dockerfile
- Basic GitLab CI pipeline:
  - build
  - test
  - package / push Docker image to GitLab Container Registry

## What students will add during Lab 07

Students should **extend** the existing pipeline with:
- `workflow: rules`
- behavior for Merge Request / `main` / tags
- protected variables:
  - `EC2_HOST`
  - `EC2_USER`
  - `SSH_PRIVATE_KEY`
- `security` stage placeholder
- SSH deployment to EC2
- `staging` environment
- manual `production` deployment from a tag
- pipeline optimization with `interruptible` and `needs`

## Local run

Requirements:
- Java 21
- Maven 3.9+

```bash
mvn clean test
mvn spring-boot:run
```

Open:

```text
http://localhost:8080/api/hello
http://localhost:8080/actuator/health
```

## Build the JAR

```bash
mvn clean package
java -jar target/*.jar
```

## Docker

```bash
docker build -t springboot-tekbook:local .
docker run --rm -p 8080:8080 springboot-tekbook:local
```

Then open:

```text
http://localhost:8080/actuator/health
```

## GitLab

Create an empty GitLab project, then:

```bash
git init
git add .
git commit -m "Initial Spring Boot starter"
git branch -M main
git remote add origin git@gitlab.com:<username>/springboot-tekbook.git
git push -u origin main
```

The provided `.gitlab-ci.yml` is intentionally a **baseline pipeline**.  
Lab 07 starts from this repository and adds the advanced AWS deployment logic.
