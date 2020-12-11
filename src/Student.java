class Student implements Comparable{
    private int id;
    private String name;
    private int age;
    Student(String name,int id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Object o){
        if(! (o instanceof Student)){
            throw new RuntimeException("The object is not  Student");
        }
        Student p=(Student)o;
        if(age<p.age)return 1;
        else if(age==p.age)return this.name.compareTo(p.name);
        else return -1;
    }
}