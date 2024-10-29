package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var emailAdapter: EmailAdapter
    private lateinit var emailList: ArrayList<Email>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        emailList = arrayListOf(
            Email("Tran Huy Hoang 20210386", "Notification", "Hello world. I am Tran Huy Hoang - 20210386", "2:30 PM"),
            Email("Caroline White", "Project Update", "Here's the latest update on the project.", "3:45 PM"),
            Email("David Brown", "Vacation Request", "I would like to request vacation days", "4:00 PM"),
            Email("Evelyn Green", "Team Outing", "We're planning a team outing next Friday.", "5:15 PM"),
            Email("Frank Taylor", "Weekly Report", "Here's the weekly report for your review.", "6:30 PM"),
            Email("Grace Williams", "New Opportunity", "We have a new opportunity that might interest you.", "7:45 PM"),
            Email("Henry Wilson", "System Maintenance", "The system will be down for maintenance.", "8:00 PM"),
            Email("Isabella Martinez", "Workshop Invitation", "You are invited to a workshop on cloud computing.", "9:15 PM"),
            Email("Jack Anderson", "Newsletter", "Check out our latest newsletter for updates.", "10:30 PM"),
            Email("Katherine Thomas", "Security Alert", "A new security update is available. Please install it.", "11:45 PM"),
            Email("Liam Lee", "Product Launch", "We're excited to announce the launch of our new product.", "12:00 AM"),
            Email("Mia Harris", "Survey Request", "Please take a moment to complete our survey.", "1:15 AM"),
            Email("Natalie Clark", "Service Reminder", "This is a reminder for your upcoming service.", "2:30 AM"),
            Email("Oliver Lewis", "Account Activation", "Activate your account by clicking the link below.", "3:45 AM"),
            Email("Paul Walker", "Job Application", "Thank you for applying.", "4:00 AM"),
            Email("Quinn Young", "Order Confirmation", "Your order has been confirmed. Details are attached.", "5:15 AM"),
            Email("Rose King", "Event Reminder", "Don't forget about the event tomorrow.", "6:30 AM"),
            Email("Samuel Hall", "Password Reset", "Click the link to reset your password.", "7:45 AM"),
            Email("Tina Lopez", "Subscription Renewal", "Your subscription is up for renewal. Please review.", "8:00 AM"),
            Email("Uma Scott", "Feedback Request", "We'd love to hear your feedback on our product.", "9:15 AM")
        )

        emailAdapter = EmailAdapter(emailList)
        recyclerView.adapter = emailAdapter
    }
}

