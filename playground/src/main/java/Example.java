public class Example {
    
    public static void main (String[] args) {
        
        Person person = new Person();
        
        Name name = new Name();
        name.setTitle("Saint");
        name.setGivenName("George");
        name.setInitials("Robert");
        name.setFamilyName("Fyles");
        
        person.setName(name);
        
        Address address = new Address();
        address.setHouseNumber(247);
        address.setStreet("Summerwood road");
        address.setTown("isleworth middlesex");
        address.setCountry("in the United Kingdom");
        address.setPostcode("TW7 7QW"); 
        
        person.setAddress(address);
        
        String hello = person.sayHello();
        System.out.println(hello);
        
    }
    
}