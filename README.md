# it-ibm-stage

# Esercizio 07_03_2024
1) Creare un branch denominato feature/NOME_COGNOME ed utilizzarlo per sviluppare
2) Al fine di far compilare il codice è necessario inserire le dipendenze di seguito
   ```
    <dependency>
		<groupId>com.google.code.gson</groupId>
		<artifactId>gson</artifactId>
		<version>2.9.1</version>
	</dependency>
		
    <!-- Dipendenza per JAXB API -->
    <dependency>
        <groupId>javax.xml.bind</groupId>
        <artifactId>jaxb-api</artifactId>
        <version>2.3.1</version>
    </dependency>

    <!-- Dipendenza per implementazione di JAXB -->
    <dependency>
        <groupId>org.glassfish.jaxb</groupId>
        <artifactId>jaxb-runtime</artifactId>
        <version>2.3.3</version>
    </dependency>
   ```

4) Creare la classe StringUtility e realizzare all'interno i metodi per la conversion da e to json e da/to xml

5) Realizzare un main che legge il file user.json dalle resource tramite il metodo getFileFromInternalResources della classe FileUtility. Realizzare un model in java capace di contenere il json letto. Individuare l'utente che ha il nome proprio ed eseguire una conversione in xml dello stesso valorizzando l'attributo eta.

6) Stampare in console il json e l'xml relativi alla propria persona. Il json dovrà contenere l'attributo sesso, mentre l'xml l'attributo eta.

