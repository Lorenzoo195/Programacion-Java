package Type;

public class Color {
    private String _strNombre;
    private Byte _iR;
    private Byte _iG;
    private Byte _iB;
    private String _strHExValue;

    public String getNombre() {
        return _strNombre;
    }

    private void setNombre(String value) {
        this._strNombre = value;
    }

    public Byte getR() {
        return _iR;
    }

    private void setR(Byte value) {
        this._iR = value;
    }

    public Byte getG() {
        return _iG;
    }

    private void setG(Byte value) {
        this._iG = value;
    }

    public Byte getB() {
        return _iB;
    }

    private void setB(Byte value) {
        this._iB = value;
    }

    public String getHExValue() {
        return _strHExValue;
    }

    private void setHExValue(String value) {
        this._strHExValue = value;
    }

    public Color(String _strNombre, Byte _iR, Byte _iG, Byte _iB, String _strHExValue) {
        setNombre(_strNombre);
        setR(_iR);
        setG(_iG);
        setB(_iB);
        setHExValue(_strHExValue);
    }
    public Color() {
        setNombre("Blanco");
        setR((byte)255);
        setG((byte)255);
        setB((byte)255);
        setHExValue("0xFFFFFF");
    }
}
