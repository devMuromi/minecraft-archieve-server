# mc-archieve-server
Minecraft Archive + Achieve

Minecraft Archieve app backend repository

## Commands
- Setup docker db
```shell
docker compose -f docker-compose.dev.yml up
```

## Environment
- Java 17

## Stacks
- Spring
  - Spring Boots
  - Spring Security
  - JPA
- JUnits
- MySQL
- S3 & R2
- Docker

## Development focus points
- Test
- CI/CD
- Speed(in development)

## How to run
### environment
application.yml에서 실행환경에 따라 spring.profiles.active를 변경해주세요.
- prod: production 환경
- dev: development 환경
- test: github actions에서 사용하는 테스트 환경

prod 사용시 application-example.yml을 참고하여 application-secret.yml을 작성해야 합니다.