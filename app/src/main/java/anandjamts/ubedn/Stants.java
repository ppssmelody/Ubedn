package anandjamts.ubedn;

/**
 * Created by T on 11/30/2017.
 */

public class Stants {
    private int no ;
    private String rp;
    private int ychno;
    private String fiderner;
    private String tooluuriinMark;
    private long tooluuriinDugaar;
    private String gtrMark;
    private long gtrCFazNo;
    private long gtrAFazNo;
    private int gtrKo;
    private String htrMark;
    private long htrDugaar;
    private int htrKo;
    private int latsNo;

    public  Stants(){

    }
    public Stants(int no, String rp, int ychno, String fider_ner, String tooluuriin_mark, long tooluuriin_dugaar, String guidliin_tr_iin_mark, long guidliin_tr_iin_c_faz_no, long guidliin_tr_iin_a_faz_no, int guidliin_tr_iin_ko, String huchdeliin_tr_iin_mark, long huchdeliin_tr_iin_dugaar, int huchdeliin_tr_iin_ko, int lats_no) {
        this.no = no;
        this.rp = rp;
        this.ychno = ychno;
        fiderner = fider_ner;
        tooluuriinMark = tooluuriin_mark;
        tooluuriinDugaar = tooluuriin_dugaar;
        gtrMark = guidliin_tr_iin_mark;
        gtrCFazNo = guidliin_tr_iin_c_faz_no;
        gtrAFazNo = guidliin_tr_iin_a_faz_no;
        gtrKo = guidliin_tr_iin_ko;
        htrMark = huchdeliin_tr_iin_mark;
        htrDugaar = huchdeliin_tr_iin_dugaar;
        htrKo = huchdeliin_tr_iin_ko;
        latsNo = lats_no;
    }

    public int getno() {
        return no;
    }
    public void setno(int no) {
        this.no = no;
    }
    public String getRP() {
        return rp;
    }
    public void setRP(String rp) {
        this.rp=rp;
    }
    public String getfiderner() {
        return fiderner;
    }
    public void setfiderner(String fiderner) {
        this.fiderner = fiderner;
    }
    public int getychno() {
        return ychno;
    }
    public void setychno(int ychno) {
        this.ychno = ychno;
    }
    public String gettooluuriinMark() {
        return tooluuriinMark;
    }
    public void settooluuriinMark(String tooluuriinMark) {
        this.tooluuriinMark = tooluuriinMark;
    }
    public long gettooluuriinDugaar() {
        return tooluuriinDugaar;
    }
    public void settooluuriinDugaar(long tooluuriinDugaar) {
        this.tooluuriinDugaar = tooluuriinDugaar;
    }
    public String getgtrMark() {
        return gtrMark;
    }
    public void setgtrMark(String gtrMark) {
        this.gtrMark = gtrMark;
    }
    public long getgtrCFazNo() {
        return gtrCFazNo;
    }
    public void setgtrCFazNo(long gtrCFazNo) {
        this.gtrCFazNo = gtrCFazNo;
    }
    public long getgtrAFazNo() {
        return gtrAFazNo;
    }
    public void setgtrAFazNo(long gtrAFazNo) {
        this.gtrAFazNo = gtrAFazNo;
    }
    public int getgtrKo() {
        return gtrKo;
    }
    public void setgtrKo(int gtrKo) {
        this.gtrKo = gtrKo;
    }
    public String gethtrMark() {
        return htrMark;
    }
    public void sethtrMark(String htrMark) {
        this.htrMark = htrMark;
    }
    public long gethtrDugaar() {
        return htrDugaar;
    }
    public void sethtrDugaar(long htrDugaar) {
        this.htrDugaar = htrDugaar;
    }
    public int gethtrKo() {
        return htrKo;
    }
    public void sethtrKo(int htrKo) {
        this.htrKo = htrKo;
    }
    public int getlatsNo() {
        return latsNo;
    }
    public void setlatsNo(int latsNo) {
        this.latsNo = latsNo;
    }
}
