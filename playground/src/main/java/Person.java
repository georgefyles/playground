public class Person {
    
    private Name name;
    
    private Address address;
    
    public Name getName() {
        return name;
    }
    
    public void setName(Name name) {
        this.name = name;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public String sayHello() {
        String hello = "Hello,";
        
        if (name == null) {
            hello += " I don't know my name";
        } else {
            hello += " my name is " + name.toString();
        }
        
        hello += " and";
        
        if (address == null) {
            hello += " I don't know my address";
        } else {
            hello += " my address is " + address.toString();
        }
        hello += ".";
        
        return hello;
    }

    
}