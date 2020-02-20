package packlaborategia3;

public interface IZatikia
{

	public abstract void sinplifikatu();
	public abstract Zatikia gehitu(Zatikia pZatikia);
	public abstract Zatikia kendu(Zatikia pZatikia);
	public abstract Zatikia biderkatu(Zatikia pZatikia);
	public abstract Zatikia zatitu(Zatikia pZatikia);
	public abstract boolean berdinaDa(Zatikia pZatikia);	
	public abstract boolean handiagoaDa(Zatikia pZatikia);
	public abstract boolean txikiagoaDa(Zatikia pZatikia);
        public abstract boolean izendatzaileBerdinaDu(Zatikia pZatikia);
        public abstract boolean zenbakitzaileBerdinaDu(Zatikia pZatikia);
}
