build:
	@docker compose down 
	@./amqp-publisher/mvnw clean package
	@docker compose up -d --build

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