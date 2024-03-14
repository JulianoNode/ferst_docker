	# ferst_docker

	# Power shell ou cmd

C:\Users\Nome> docker run --version
C:\Users\Nome> docker run hello-world

	# Arquivo Dockerfile Java

FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]


	# Construndo um jar na IDEs 'eclipse' e a Docker Images

C:\temp-code\ferst_docker\hello-docker-after> mvn clean package -DskipTests
C:\temp-code\ferst_docker\hello-docker-after> docker build -t hello-docker:0.0.2-SNAPSHOT .

	# PowerShell Etapa 1
	# Crindo contenners no docker

C:\Users\Juliano> docker images
C:\Users\Juliano> docker tag hello-docker:0.0.2-SNAPSHOT julianonode/hello-docker:0.0.2-SNAPSHOT
	# Logando no Docker Hub
C:\Users\Juliano> docker login docker.io
	# Enviando App Para o Docker Hub
C:\Users\Juliano> docker push julianonode/hello-docker:0.0.1-SNAPSHOT
	# Rodando o container  do docker " -p = PORTA e |<-->| -d = TERMINAL"
C:\Users\Juliano> docker run -p 80:80 julianonode/hello-docker:0.0.1-SNAPSHOT
C:\Users\Juliano> docker run -p 80:80 -d julianonode/hello-docker:0.0.1-SNAPSHOT
http://localhost:80/hello-docker
	# Comados de Conteinner rodando
	# Listando CONTAINER
C:\Users\Juliano> docker ps
C:\Users\Juliano> docker container ls
	# CONTAINER ID = CONTAINER ID
C:\Users\Juliano> docker container stop CONTAINER ID
C:\Users\Juliano> docker logs CONTAINER ID
	# CONTAINER em execução para analize
C:\Users\Juliano> docker logs -f CONTAINER ID
	# Patando o contenner em execução
C:\Users\Juliano> docker container stop CONTAINER ID
C:\Users\Juliano> docker container ls -a

	# PowerShell Etapa 2
	# Rodando o contenner do docker " -p = PORTA e |<-->| -d = TERMINAL"
C:\Users\Juliano> docker run -p 81:80 julianonode/hello-docker:0.0.2-SNAPSHOT
C:\Users\Juliano> docker run -p 81:80 -d julianonode/hello-docker:0.0.2-SNAPSHOT
http://localhost:81/hello-docker

	# Site para criar um e-mail temporario
https://www.guerrillamail.com/pt/inbox

	# Baixando o MySQL Para a minha maquina
C:\Users\Juliano> docker pull mysql
	
	# Configurando tag no docker hub
C:\Users\Juliano> docker tag julianonode/hello-docker:0.0.2-SNAPSHOT julianonode/hello-docker:latest
C:\Users\Juliano> docker images
C:\Users\Juliano> docker push julianonode/hello-docker:latest

	# PowerShell Etapa 3
	# Pesquizando uma image para instalar
C:\Users\Juliano> docker search mysql
C:\Users\Juliano> docker search mysql --filter is-official=true
	# Baixando o MySQL Para a minha maquina
C:\Users\Juliano> docker pull mysql
C:\Users\Juliano> docker pull mariadb
	# Historia da image no conteniner
C:\Users\Juliano> docker image history  CONTAINER ID
C:\Users\Juliano> docker image inspect CONTAINER ID
	# Removendo um a image
C:\Users\Juliano> docker image remove CONTAINER ID
C:\Users\Juliano> docker rmi CONTAINER ID
	# Forçando a remoção da image
C:\Users\Juliano> docker rmi CONTAINER ID -f

	# PowerShell Etapa 4
	# Pausar containers
C:\Users\Juliano>docker container pause -f CONTAINER ID
	# Dis Pausar containers
C:\Users\Juliano>docker container unpause CONTAINER ID
	# Estrutura do containers
C:\Users\Juliano>docker container inspect CONTAINER ID
	# Stop do containers
C:\Users\Juliano>docker stop CONTAINER ID
	# Deletando container s que não esta em execução
C:\Users\Juliano>docker container prune
	# Interronpendo containers
C:\Users\Juliano>docker container kill CONTAINER ID
	# Reinicializando o container  do docker
C:\Users\Juliano> docker run -p 80:80 --restart=always julianonode/hello-docker:0.0.1-SNAPSHOT

	# PowerShell Etapa 5
	# Acompanhamento de container s
C:\Users\Juliano>docker events

	# Processo de containers
C:\Users\Juliano> docker stop CONTAINER ID
C:\Users\Juliano> docker run -p 80:80 -d julianonode/hello-docker:0.0.1-SNAPSHOT
C:\Users\Juliano> docker container ls -a
C:\Users\Juliano> docker top CONTAINER ID
	# Processo status do containers
C:\Users\Juliano> docker stats
 	# Processo de Memoria e CPU do containers
C:\Users\Juliano> docker run -p 80:80 -d -m 512m --cpu-quota 5000 julianonode/hello-docker:0.0.1-SNAPSHOT
	# Informações do systema
C:\Users\Juliano> docker system df
