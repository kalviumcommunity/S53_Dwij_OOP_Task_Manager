package core;

public class User {
     private String username;
     private String email;
     private String role;
 
     public User(String username, String email, String role) {
         this.username = username;
         this.email = email;
         this.role = role;
     }
 
     public String getUsername() {
         return username;
     }
 
     public void setUsername(String username) {
         if (username != null && !username.isEmpty()) {
             this.username = username;
         } else {
             System.out.println("Username cannot be empty.");
         }
     }
 
     public String getEmail() {
         return email;
     }
 
     public void setEmail(String email) {
         if (email.contains("@")) {  // Simple check for a valid email format
             this.email = email;
         } else {
             System.out.println("Invalid email format.");
         }
     }
 
     public String getRole() {
         return role;
     }
 
     public void setRole(String role) {
         if (role.equals("Admin") || role.equals("Regular User")) {
             this.role = role;
         } else {
             System.out.println("Invalid role. Please set as 'Admin' or 'Regular User'.");
         }
     }
 
     public void displayUserDetails() {
         System.out.println("Username: " + username + "\nEmail: " + email + "\nRole: " + role);
     }
}
