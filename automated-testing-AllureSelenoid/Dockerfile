FROM ubuntu
ADD ./ prod
WORKDIR prod
RUN apt-get update -y && apt-get install python3 -y && apt-get update && apt-get install python3-requests -y && \
	apt-get update && apt-get install dos2unix -y && dos2unix ./gradlew &&\
	apt update && apt install default-jdk -y && \
	dos2unix ./sendResLin.py \
	
	
	

