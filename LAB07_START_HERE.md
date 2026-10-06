# Lab 07 — Start Here

Use this project as the starting point for the AWS deployment lab.

Before starting the lab, verify:

1. The application builds:
   `mvn clean package`

2. Tests pass:
   `mvn test`

3. The health endpoint works:
   `http://localhost:8080/actuator/health`

4. The Docker image works:
   `docker build -t springboot-tekbook:local .`
   `docker run --rm -p 8080:8080 springboot-tekbook:local`

5. The GitLab pipeline is green and the Docker image appears in:
   `Deploy > Container Registry`

Then continue with Lab 07:
- workflow/rules
- protected variables
- SSH to AWS EC2
- staging deployment
- manual production deployment
- pipeline optimization
