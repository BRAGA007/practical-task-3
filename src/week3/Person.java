package week3;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;

    public Person(String lastName, String firstName, String middleName){ // for LastName + FirstName + MiddleName
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        
    }

    public Person(String lastName, String firstName){ // for LastName + FirstName
        this.firstName = firstName;
        this.middleName = null;
        this.lastName = lastName;
        
    }

    public Person(String lastName){ // for LastName
    	this.firstName = null;
        this.middleName = null;
        this.lastName = lastName;
    }
    public String toString() {
        if(firstName != null){
            StringBuilder sb = new StringBuilder();
            if(middleName != null) {
                sb.append(lastName)
                        .append(" ")
                        .append(firstName.charAt(0)) // add first first letter of the firstname
                        .append(".")
                        .append(middleName.charAt(0)) // add first first letter of the middlemame
                        .append(".");
                return new String(sb); 
            }
            sb.append(lastName)
                    .append(" ")
                    .append(firstName.charAt(0))
                    .append(".");
            return new String(sb); 
        }
        return lastName; 
    }


    public static void main(String[] args){{
            Person pers1 = new Person("Sidorov", "Sergei", "Semenovich");
            Person pers2 = new Person("Sidorov", "Sergei");
            Person pers3 = new Person("Sidorov");
            System.out.println(pers1.toString()); // LastName + FirstName + MiddleName
            System.out.println(pers2.toString()); // LastName + FirstName
            System.out.println(pers3.toString()); // LastName
        }

    }
}