import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static int testInt;
    public static int yearInt;
    public static int monthInt;
    public static int dayInt;
    public static String sign = "";

    public static void main(String[] args) {

        int width = 420;
        int height = 420;

        MyFrame frame = new MyFrame(width, height, "Trispalve");
        frame.setSize(height, width);
        frame.setTitle("Horoskopas");

        ImageIcon logo = new ImageIcon("src/main/zodiak-logo.png"); //create an ImageIcon
        frame.setIconImage(logo.getImage()); //change icon of frame

        //#region Sukuriu reikalingus labels
        JLabel labelAvinas = new JLabel(); // creates a label
        JLabel labelJautis = new JLabel();
        JLabel labelDvyniai = new JLabel();
        JLabel labelVezys = new JLabel();
        JLabel labelLiutas = new JLabel();
        JLabel labelMergele = new JLabel();
        JLabel labelSvarstykles = new JLabel();
        JLabel labelSkorpionas = new JLabel();
        JLabel labelSaulys = new JLabel();
        JLabel labelOziaragis = new JLabel();
        JLabel labelVandenis = new JLabel();
        JLabel labelZuvys = new JLabel();

        JLabel labelBodyUp = new JLabel();
        JLabel labelBodyCenter = new JLabel();
        JLabel labelHoroscope = new JLabel();


        labelAvinas.setText("<html>" +
                "Nesistenkite visko tempti vieni,<br>" +
                " jeigu užsiimate išsamiu namų, sodybos<br>" +
                " ar darbo vietos tvarkymu. Dalinkitės<br>" +
                " pareigomis su šalia esančiais, tarkitės<br>" +
                " dėl išlaidų. Nenumokite ranka į sveikatos<br>" +
                " sutrikimus.</html>"); // set text of label1
        labelJautis.setText("<html>" +
                "Tikriausiai šiandien patirsite<br>" +
                " ypatingų emocinių impulsų. Galite<br>" +
                " leistis į lengvabūdišką avantiūrą,<br>" +
                " ką nors vilioti, flirtuoti. Turėtų<br>" +
                " pagerėti santykiai su vaikais.</html>");
        labelDvyniai.setText("<html>" +
                "Trokšite geresnių sąlygų, komforto,<br>" +
                " patogumų. Galbūt kažką pertvarkinėsite.<br>" +
                " Tai gali kainuoti daugiau, nei<br>" +
                " apskaičiavote iš anksto. Pasisaugokite sukčių.</html>");
        labelVezys.setText("<html>" +
                "Savo energiją nukreipkite į darbą,<br>" +
                " mokslą ar kūrybą, o ne į tuščius ginčus,<br>" +
                " ambicijų demonstravimą. Nuo to<br>" +
                " priklausys, kaip pakryps pokalbis,<br>" +
                " turėsiantis įtakos jūsų autoritetui.</html>");
        labelLiutas.setText("<html>" +
                "Aiškės finansinės perspektyvos, galėsite<br>" +
                " numatyti, kaip racionaliau panaudoti<br>" +
                " turimas lėšas. Regis, jums kils<br>" +
                " ūpas šį bei tą nusipirkti, atsinaujinti.<br>" +
                " O galbūt rūpinsitės dovana kažkam,<br>" +
                " kas jums išties rūpi.</html>");
        labelMergele.setText("<html>" +
                "Tai gali būti naujų galimybių diena,<br>" +
                " kai po ilgų pastangų ims ryškėti<br>" +
                " perspektyvos. Viskas taip trapu,<br>" +
                " kad lengva sugadinti. Saugokitės<br>" +
                " klastų, vagysčių, apsinuodijimo.</html>");
        labelSvarstykles.setText("<html>" +
                "Gana neutrali diena – kaip pasiklosite,<br>" +
                " taip išsimiegosite. Nelabai tiktų imtis<br>" +
                " intensyvios veiklos. Pasisaugokite, kad<br>" +
                " dėl alkoholio ar netinkamų produktų,<br>" +
                " vaistų vartojimo nekiltų problemų.</html>");
        labelSkorpionas.setText("<html>" +
                "Šiandien teigiamai veiksite aplinkinius<br>" +
                " ir jie – jus. Žadinsite draugiškumo bei<br>" +
                " solidarumo jausmus. Verta pamėginti<br>" +
                " atnaujinti jums svarbius santykius,<br>" +
                " jeigu jie neseniai patyrė krizę.</html>");
        labelSaulys.setText("<html>" +
                "Jeigu būtina, šiandien tvarkykite<br>" +
                " dokumentus, kreipkitės į valdžią dėl<br>" +
                " leidimų, oficialių raštų, patvirtinimų,<br>" +
                " atsiskaitymų. Bus nelengva, tačiau<br>" +
                " naudokitės tomis progomis, kurios įmanomos.</html>");
        labelOziaragis.setText("<html>" +
                "Šiandien ypač aktualūs gali būti<br>" +
                " su išsilavinimu, studijomis, įstatymais,<br>" +
                " kelionėmis susiję reikalai. Galbūt<br>" +
                " nustebins kolega ar pažįstamas iš užsienio.</html>");

        labelVandenis.setText("<html>" +
                " Šiandien ne viskas džiugins.<br>" +
                " Galbūt kažkas primins negrąžintą<br>" +
                " skolą, paprašys paslaugos, kurią<br>" +
                " gana keblu suteikti. Galite įsigyti<br>" +
                " brokuotą daiktą, dėl jo aiškintis ir pan.</html>");
        labelZuvys.setText("<html>" +
                " Jūsų nuotaikos ir emocijos bus<br>" +
                " labai nepastovios. Neleiskite, kad<br>" +
                " sąmonę užvaldytų nepagrįsti įtarimai,<br>" +
                " pavydas. Tai prasti palydovai, norint<br>" +
                " išsaugoti santykius.</html>");

        labelBodyUp.setText("Iveskite gimimo data");

        //#endregion

        //#region sukurti JPanel header
        JPanel header = new JPanel();
        header.setBackground(Color.decode("#f4f4f4"));
        header.setSize(width, height / 10);
        frame.add(header, BorderLayout.PAGE_START);
        //#endregion

        //#region sukurti JPanel body
        JPanel body = new JPanel();
        body.setBackground(Color.decode("#f4f4f4"));
        body.setSize(width, height / 3);
        body.setLayout(new BorderLayout(1, 1));
        body.setVisible(true);
        frame.add(body, BorderLayout.CENTER);

        //#endregion

        //#region sukurti JPanel footer
        JPanel footer = new JPanel();
        footer.setBackground(Color.decode("#f4f4f4"));
        footer.setSize(width, height / 3);
        frame.add(footer, BorderLayout.PAGE_END);
        //#endregion

        //Sukuriu input boxams krastus ir nustatau ju spalva
        Border borderGray = BorderFactory.createLineBorder(Color.GRAY, 1);
        Border borderRed = BorderFactory.createLineBorder(Color.RED, 1);
        //sukuriu input boxus
        JTextField inpBox1 = new JTextField("", 10);
        JTextField inpBox2 = new JTextField("", 10);
        JTextField inpBox3 = new JTextField("", 10);

        // input boxus pridedu prie header paneles
        header.add(inpBox1);
        header.add(inpBox2);
        header.add(inpBox3);

        //Sukuriu mygtukus

        JButton btnFind = new JButton("Find");
        JButton btnClear = new JButton("Clear");
        btnFind.setSize(width / 3, height / 10);
        btnClear.setSize(width / 3, height / 10);
        // mygtukus pridedu prie footer paneles

        footer.add(btnFind);
        footer.add(btnClear);

        frame.setVisible(true);

        //#region Mygtuku logika
        btnFind.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // patikrinu vartotojo ivestus duomenis ir konvertuoju i integer

                try {
                    //testInt = Integer.parseInt(inpBox1.getText() + inpBox2.getText() + inpBox3.getText());
                    yearInt = Integer.parseInt(inpBox1.getText());
                    monthInt = Integer.parseInt(inpBox2.getText());
                    dayInt = Integer.parseInt(inpBox3.getText());
                    inpBox1.setBorder(borderGray);
                    inpBox2.setBorder(borderGray);
                    inpBox3.setBorder(borderGray);
                    labelBodyUp.setForeground(Color.BLACK);
                    labelBodyUp.setText("Iveskite gimimo data");
                } catch (NumberFormatException wrongInput) {
                    inpBox1.setBorder(borderRed);
                    inpBox2.setBorder(borderRed);
                    inpBox3.setBorder(borderRed);
                    labelBodyUp.setForeground(Color.RED);
                    labelBodyUp.setText("Blogai ivesti duomenys!");
                }


                //#region horoskopo datu logika

                if (monthInt == 1) {
                    if (dayInt < 20)
                        sign = "Ožiaragis";
                    else
                        sign = "Vandenis";
                } else if (monthInt == 2) {
                    if (dayInt < 19)
                        sign = "Vandenis";
                    else
                        sign = "Žuvys";
                } else if (monthInt == 3) {
                    if (dayInt < 21)
                        sign = "Žuvys";
                    else
                        sign = "Avinas";
                } else if (monthInt == 4) {
                    if (dayInt < 20)
                        sign = "Avinas";
                    else
                        sign = "Jautis";
                } else if (monthInt == 5) {
                    if (dayInt < 21)
                        sign = "Jautis";
                    else
                        sign = "Dvyniai";
                } else if (monthInt == 6) {
                    if (dayInt < 21)
                        sign = "Dvyniai";
                    else
                        sign = "Vėžys";
                } else if (monthInt == 7) {
                    if (dayInt < 23)
                        sign = "Vėžys";
                    else
                        sign = "Liūtas";
                } else if (monthInt == 8) {
                    if (dayInt < 23)
                        sign = "Liūtas";
                    else
                        sign = "Mergelė";
                } else if (monthInt == 9) {
                    if (dayInt < 23)
                        sign = "Mergelė";
                    else
                        sign = "Svarstyklės";
                } else if (monthInt == 10) {
                    if (dayInt < 23)
                        sign = "Svarstyklės";
                    else
                        sign = "Scorpionas";
                } else if (monthInt == 11) {
                    if (dayInt < 22)
                        sign = "Scorpionas";
                    else
                        sign = "Šaulys";
                } else if (monthInt == 12) {
                    if (dayInt < 22)
                        sign = "Šaulys";
                    else
                        sign = "Ožiaragis";

                }
                //#endregion

                labelBodyCenter.setText("<html>" + sign + "<br>" +
                        "Dabartinis amžius yra " + "metai." + "</html>");

                //#region nurodau koki teksta atvaizduoti priklausomai nuo zenklo
                if (sign == "Avinas") {
                    labelHoroscope.setText(labelAvinas.getText());
                }
                if (sign == "Jautis") {
                    labelHoroscope.setText(labelJautis.getText());
                }
                if (sign == "Dvyniai") {
                    labelHoroscope.setText(labelDvyniai.getText());
                }
                if (sign == "Vėžys") {
                    labelHoroscope.setText(labelVezys.getText());
                }
                if (sign == "Liūtas") {
                    labelHoroscope.setText(labelLiutas.getText());
                }
                if (sign == "Mergelė") {
                    labelHoroscope.setText(labelMergele.getText());
                }
                if (sign == "Svarstyklės") {
                    labelHoroscope.setText(labelSvarstykles.getText());
                }
                if (sign == "Skorpionas") {
                    labelHoroscope.setText(labelSkorpionas.getText());
                }
                if (sign == "Šaulys") {
                    labelHoroscope.setText(labelSaulys.getText());
                }
                if (sign == "Ožiaragis") {
                    labelHoroscope.setText(labelOziaragis.getText());
                }
                if (sign == "Vandenis") {
                    labelHoroscope.setText(labelVandenis.getText());
                }
                if (sign == "Žuvys") {
                    labelHoroscope.setText(labelZuvys.getText());
                }
                //#endregion


                if (labelBodyUp.getText() == "Blogai ivesti duomenys!") {
                    labelBodyCenter.setText(" ");
                    labelHoroscope.setText(" ");
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inpBox1.setText("");
                inpBox2.setText("");
                inpBox3.setText("");
            }
        });
        //#endregion


        labelBodyUp.setSize(width, body.getHeight() / 3);
        body.add(labelBodyUp, BorderLayout.NORTH);
        labelBodyCenter.setSize(width, body.getHeight() / 3);
        body.add(labelBodyCenter, BorderLayout.CENTER);
        labelHoroscope.setSize(width, body.getHeight() / 3);
        body.add(labelHoroscope, BorderLayout.SOUTH);


    }
}
