package Types;
public class Color {
    private String _strNombre;
    private Byte _byR;
    private Byte _byG;
    private Byte _byB;
    private String _strHexValue;

    public String getNombre() {
        return _strNombre;
    }

    private void setNombre(String value) {
        this._strNombre = value;
    }

    public Byte getR() {
        return _byR;
    }

    private void setR(Byte value) {
        this._byR = value;
    }

    public Byte getG() {
        return _byG;
    }

    private void setG(Byte value) {
        this._byG = value;
    }

    public Byte getB() {
        return _byB;
    }

    private void setB(Byte value) {
        this._byB = value;
    }

    public String getHexValue() {
        return _strHexValue;
    }

    private void setHexValue(String value) {
        this._strHexValue = value;
    }

    public Color()
    {
        setNombre ("Blanco");
        setR((byte)255);
        setG((byte)255);
        setB((byte)255);
        setHexValue("0xFFFFFF");
    }

    public Color(String p_strNombre, Byte p_byR, Byte p_byG, Byte p_byB, String p_strHexValue) {
        setNombre (p_strNombre);
        setR(p_byR);
        setG(p_byG);
        setB(p_byB);
        setHexValue(p_strHexValue);
    }
}
