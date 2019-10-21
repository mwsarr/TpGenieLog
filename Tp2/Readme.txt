Michel Waly SARR

quand on tape la commande Make pour la première fois, les fichiers.o et l’exécutable(example) sont créés

et quand on la retape,on va que le fichier example a été supprrimé


////  Makefile2  ////


Quand on tape la commande « make -f Makefile2 » la compilation se passe normalement comme avec make
Lorsqu’on la retape on a message comme quoi il y’a rien à faire pour pour «all»

Si on change la fonction «function.h» il y’a une erreur car dans la fonction «function.c» c’est pas ce qui est attendu.  

lorsqu'on tape la commande «make -f Makefile2 clean» tous les fichiers.o et l’exécutable sont supprimés


//// Scons ////

lorsqu’on retape la commande les fichiers ne sont pas recompilés

la commande «scons -c » permet d’effacer les fichiers.o et l’exécutable

///Ant///
j’ai essayé d’executer le fichier build.xml mais ça ne marche pas il  me fait des erreurs de compilation
