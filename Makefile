build:
	docker compose up -d --build

start:
	docker compose start

stop:
	docker compose stop

down:
	docker compose down

purge:
	docker compose down --rmi all --volumes --remove-orphans

follow:
	docker compose logs --follow --tail 100 