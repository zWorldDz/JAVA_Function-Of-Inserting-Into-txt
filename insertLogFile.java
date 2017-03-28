    public void insertLogFile(String User) {
            try {
                PrintWriter writer = new PrintWriter("log_file.txt", "UTF-8");
                writer.println("User " +User+ " has accessed to the system.");
                writer.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }    
