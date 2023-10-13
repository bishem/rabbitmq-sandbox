build:
	@docker compose down
	@cd amqp-publisher && ./mvnw clean package
	@cd .. && docker compose up -d --build

start:
	@docker compose start

stop:
	@docker compose stop

down:
	@docker compose down

purge:
	@docker compose down --rmi all --volumes --remove-orphans
	@./amqp-publisher/mvnw clean

follow:
	@docker compose logs --follow --tail 100

dev:
	@docker compose -f rabbit.docker-compose.yml up -d
	@cd amqp-publisher && ./mvnw spring-boot:run