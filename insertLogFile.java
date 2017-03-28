    public void insertLogFile(String User) {
            try {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
           
                Writer writer = new BufferedWriter(new FileWriter("log_file.txt", true));
                writer.append(dtf.format(now) + " User " + User + " has accessed to the system.");
                writer.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }    
