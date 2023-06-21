package sg.edu.nus.iss.day22.Model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RSVP 
{
    private int id;
    private String fullName;
    private String email;
    private Integer phone;
    private Date confirmationDate;
    private String comment;
}
