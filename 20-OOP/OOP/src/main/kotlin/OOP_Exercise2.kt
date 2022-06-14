fun main() {
    val job = Job()
    println(job.name)
    println(job.revenue)
    println(job.salary)
    job.work()
    job.work()
    job.study()
    job.work()

    val engineer = Engineer()
    engineer.name = "Engineer"
    engineer.salary = 90000.00
    println(engineer.name)
    println(engineer.revenue)
    println(engineer.salary)
    engineer.work()
    engineer.work()
    engineer.study()
    engineer.work()

    val doctor = Doctor()
    doctor.name = "Doctor"
    doctor.salary = 180000.00
    println(doctor.name)
    println(doctor.revenue)
    println(doctor.salary)
    doctor.work()
    doctor.work()
    doctor.study()
    doctor.work()
}

open class Job {
    var name: String = "Job"
    var revenue: Double = 0.0
    var salary: Double = 60000.00

    fun work() {
        revenue += salary
        println("Revenue is now $revenue")
    }

    fun study() {
        salary += 10000
        println("Salary is now $salary")
    }
}

class Engineer : Job()

class Doctor : Job()