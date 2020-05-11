javac -d classes/ src/com/ncu/exceptions/*.java

javac -cp classes/ -d classes/ src/com/ncu/validators/NameValidator.java

javac -d classes/ src/com/ncu/menu/*.java

javac -cp classes/ -d classes/ src/com/ncu/main/pmain.java

java -cp classes/ com.ncu.main.pmain