/*
 Copyright (c) 2014 Ron Coleman

 Permission is hereby granted, free of charge, to any person obtaining
 a copy of this software and associated documentation files (the
 "Software"), to deal in the Software without restriction, including
 without limitation the rights to use, copy, modify, merge, publish,
 distribute, sublicense, and/or sell copies of the Software, and to
 permit persons to whom the Software is furnished to do so, subject to
 the following conditions:

 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package charlie.server;

import java.io.Serializable;

/**
 * This class contains login credentials.
 * @author Ron Coleman
 */
public class Login implements Serializable {
    private String logname;
    private String password;
    
    /**
     * Constructor
     */
    public Login() {
    }
    
    /**
     * Constructor
     * @param logname Log name
     * @param password Password
     */
    public Login(String logname,String password) {
        this.logname = logname;
        this.password = password;
    }

    /**
     * Gets log name.
     * @return String
     */
    public String getLogname() {
        return logname;
    }

    /**
     * Gets password.
     * @return String
     */
    public String getPassword() {
        return password;
    }
}
