package form.Handler;

import com.mysql.cj.util.StringUtils;
import form.Helper;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.text.NumberFormat;

public class Diskon implements DocumentListener {
    private JTextField txtJumlahHarga;
    private JTextField txtDiskon;
    private JTextField txtHasilDiskon;
    private JLabel lblJumlahHarga;

 
    public Diskon(JTextField txtJumlahHarga, JTextField txtDiskon, JTextField txtHasilDiskon, JLabel lblJumlahHarga) {
        this.txtJumlahHarga = txtJumlahHarga;
        this.txtDiskon = txtDiskon;
        this.txtHasilDiskon = txtHasilDiskon;
        this.lblJumlahHarga = lblJumlahHarga;
    }

    private final static NumberFormat nf = Helper.numberFormatHelper();


    private void calculateDiscount() {
        String discountText = txtDiskon.getText();
        if(StringUtils.isStrictlyNumeric(discountText)) {
            int diskon, hasil_diskon;
            diskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) * Integer.parseInt(discountText) / 100;

            hasil_diskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) - diskon;

            txtHasilDiskon.setText(nf.format(diskon));

            //total bersih semua

            int totalBersih;
            totalBersih = hasil_diskon;
            lblJumlahHarga.setText("Rp. " + nf.format(totalBersih));
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        calculateDiscount();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        calculateDiscount();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        calculateDiscount();
    }
}
