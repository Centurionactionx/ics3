Takeoff t = new Takeoff();
        Goodmorning g = new Goodmorning();

        t.start();
        g.start();
        try {
            g.join();
        } catch (Exception e) {
           // TODO: handle exception
        }