1

class Student(name: String, age: Int) {
  override def toString: String = {
    s"[$name - $age]"
  }
}

if (1 == 1) 10  else new Student("ABC", 10)

print(new Student("Ali", 20))
