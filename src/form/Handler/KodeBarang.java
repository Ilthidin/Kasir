package form.Handler;

import com.mysql.cj.util.StringUtils;
import form.Barang;
import form.DatabaseService;
import form.Helper;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.text.NumberFormat;

public class KodeBarang {
    private static NumberFormat nf = Helper.numberFormatHelper();
    public static DocumentListener fillItem(JTextField txtKodeBarang, JTextField txtNamaBarang, JTextField txtHarga, JTextField txtQTY) {
        return new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String kodeBarang;
                kodeBarang = txtKodeBarang.getText();
                Barang item = DatabaseService.findById(kodeBarang);

                if (!StringUtils.isNullOrEmpty(item.getKodeBarang())) {
                    txtNamaBarang.setText(item.getNamaBarang());
                    txtHarga.setText(nf.format(item.getHarga()));
                    txtQTY.grabFocus();
                } else {
                    txtNamaBarang.setText("");
                    txtHarga.setText("");
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String kodeBarang;
                kodeBarang = txtKodeBarang.getText();
                Barang item = DatabaseService.findById(kodeBarang);

                if (!StringUtils.isNullOrEmpty(item.getKodeBarang())) {
                    txtNamaBarang.setText(item.getNamaBarang());
                    txtHarga.setText(nf.format(item.getHarga()));
                    txtQTY.grabFocus();
                } else {
                    txtNamaBarang.setText("");
                    txtHarga.setText("");
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                String kodeBarang;
                kodeBarang = txtKodeBarang.getText();
                Barang item = DatabaseService.findById(kodeBarang);

                if (!StringUtils.isNullOrEmpty(item.getKodeBarang())) {
                    txtNamaBarang.setText(item.getNamaBarang());
                    txtHarga.setText(nf.format(item.getHarga()));
                    txtQTY.grabFocus();
                } else {
                    txtNamaBarang.setText("");
                    txtHarga.setText("");
                }
            }
        };
    }
}
