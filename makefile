NAME=main

BUILD_PATH=build

BIN_PATH=$(BUILD_PATH)/bin

JAR_PATH=$(BUILD_PATH)/jar

SOURCES=\
Carta.java 
	\
Sansano.java 
	\
Multiplayer.java 
	\
PeleaCom2.java
	\
Podio.java
	\
registroUnPlayer.java
	\
Ventana.java
	\
Profesor.java 
	\
Carrete.java 
	\
Curso.java 
	\
main.java

CLASSF=$(SOURCES:.java=.class)


%.class:src/tarea_2/%.java

	mkdir -p $(BIN_PATH)
	javac -d $(BIN_PATH) -cp  ".:src:lib/absolutelayout/AbsoluteLayout.jar:lib/absolutelayout/beansbinding.1.2.1-doc.zip" src/tarea_2/*.java

all: $(CLASSF)

jar: all
	mkdir -p build/jar/
	jar cfm  $(JAR_PATH)/$(NAME).jar  manifest -C $(BIN_PATH) .
	jar -uf  $(JAR_PATH)/$(NAME).jar -C  tarea_2 imagenes/*.png 

main: jar

run:
	java -cp .:lib/absolutelayout/AbsoluteLayout.jar -jar $(JAR_PATH)/$(NAME).jar src/tarea_2/imagenes

clean:
	rm -rf $(BUILD_PATH)
