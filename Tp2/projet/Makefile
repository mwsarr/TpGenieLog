all : main.o function.o
	gcc main.o function.o -o example

main.o : main.c
	gcc -c function.c -o function.o

function.o : function.c
	gcc -c function.c -o function.o

clean :
	rm -rf*.o example
