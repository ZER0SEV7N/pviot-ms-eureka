# Pivot Banking System - Service Registry (`pivot-ms-eureka`)

## Overview
Netflix Eureka Discovery Server (`:8761`) providing dynamic service registration, heartbeat monitoring, and client-side load balancing metadata (`lb://`) for all microservices in the Pivot Banking ecosystem.

## Architecture & Configuration
- **Stack:** Java 17 + Spring Boot 4.1.2 + Spring Cloud Netflix Eureka Server.
- **Externalized Config:** Fetched from `pivot-ms-config` (`:8888`) via `ms-eureka.yml`.
- **Control Panel Dashboard:** Enabled at `http://localhost:8761`.
- **Registered Services:** `MS-GATEWAY`, `MS-CUSTOMER`, `MS-ACCOUNT`, `MS-CREDIT`, `MS-TRANSACTION`.

## How to Run (Local & Docker)
1. Ensure `pivot-ms-config` (`:8888`) is running.
2. Start locally:
   ```powershell
   mvn clean spring-boot:run
   ```
3. Build and run in Docker:
   ```powershell
   docker build -t pivot-ms-eureka:2.0.0 .
   docker run -d -p 8761:8761 --name pivot-ms-eureka pivot-ms-eureka:2.0.0
   ```