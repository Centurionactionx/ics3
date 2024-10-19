#gui
To create a GUI:
1. Initiate the frame, buttonpanel, text panel, buttons, and label as variables.
2. Assign label variables like `new JLabel("name goes here")`
3. Assign button variables like `new JLabel("name goes here")`
4. Assign action listeners to buttons 
   `b.addActionListener(new ActionListener(){ 
   `public void actionPerformed(ActionEvent e){
   `buttonClicked`}}`
   5. Add elements to panel or frame `textPanel.add(l)`
   6. Set the frame `f = new JFrame("GUI Window)`
   7. Then organize the buttons and text: `f.add(textPanel, BorderLayout.NORTH)`
   8. Then set the boundaries for the window: `f.setBounds(x, y, width, height)`
   9. Then set it so that the program ends when the window closes using this really long thing: `f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE)`
   10. Finally make the frame visible by `f.setVisible (true);`

Don't forget to make a function that is called buttonClicked() so it runs whenever the button is clicked. You don't have to put anything in main except initialize the object because it's all in the constructor

