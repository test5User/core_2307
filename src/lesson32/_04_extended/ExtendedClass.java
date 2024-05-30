package lesson32._04_extended;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExtendedClass implements Externalizable {
    private String firstName;
    private String lastName;
    private String password;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(firstName);
        out.writeObject(lastName);
        out.writeObject(encrypt(password));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstName = (String) in.readObject();
        lastName = (String) in.readObject();
        password = decrypt((String) in.readObject());
    }

    private String encrypt(String data) {
        var encryptedData = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println(encryptedData);
        return encryptedData;
    }

    private String decrypt(String data) {
        var decryptedData = new String(Base64.getDecoder().decode(data));
        System.out.println(decryptedData);
        return decryptedData;
    }
}
