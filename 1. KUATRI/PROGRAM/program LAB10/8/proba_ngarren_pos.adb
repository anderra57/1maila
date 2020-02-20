with Datuak, Ada.Text_Io;
use Datuak, Ada.Text_Io;

with txertatu_ngarren_pos, idatzi, sortu_zerrenda_hutsa, txertatu_hasieran;


procedure proba_ngarren_pos is

    Lis: Lista;

   procedure Eskatu_Return is
   begin
      Put_Line("Sakatu return jarraitzeko ");
      Skip_Line;
   end Eskatu_Return;

begin

    Put_Line("Proba programa: ");
    Put_Line("*********");

    sortu_zerrenda_hutsa(Lis);
    Put_Line("Proba kasua 1: Txertatu zerrenda hutsean");
    txertatu_ngarren_pos(Lis, 5,1);
    Put_Line("Idatzi beharko luke: <5> ");
    idatzi(Lis);
    New_Line;
    New_Line;
    Eskatu_Return;

    sortu_zerrenda_hutsa(Lis);
    txertatu_hasieran(Lis, 4);
    txertatu_hasieran(Lis, 9);
    txertatu_hasieran(Lis, 7);
    txertatu_hasieran(Lis, 5);
    Put_Line("Proba kasua 2: Txertatu erdian");
    Put_Line("Hasierako zerrendak hurrenekoa dauka: ");
    idatzi(Lis);
    txertatu_ngarren_pos(Lis,3,3);
    Put_Line("Idatzi beharko luke: <5, 7, 3, 9, 4> ");
    idatzi(Lis);
    New_Line;
    New_Line;
    Eskatu_Return;



    sortu_zerrenda_hutsa(Lis);
    txertatu_hasieran(Lis, 4);
    txertatu_hasieran(Lis, 9);
    txertatu_hasieran(Lis, 7);
    txertatu_hasieran(Lis, 5);
    Put_Line("Proba kasua 3: insertar amaieran");
    Put_Line("Hasierako zerrendak hurrenekoa dauka: ");
    idatzi(Lis);
    txertatu_ngarren_pos(Lis, 3,5);
    Put_Line("Idatzi beharko luke: <5, 7, 9, 4, 3> ");
    idatzi(Lis);
    New_Line;
    New_Line;
    Eskatu_Return;



    sortu_zerrenda_hutsa(Lis);
    txertatu_hasieran(Lis, 4);
    txertatu_hasieran(Lis, 9);
    txertatu_hasieran(Lis, 7);
    txertatu_hasieran(Lis, 5);
    Put_Line("Proba kasua 3: Txertatu hasieran");
    Put_Line("Hasierako zerrendak hurrenekoa dauka: ");
    idatzi(Lis);
    txertatu_ngarren_pos(Lis, 3,1);
    Put_Line("Idatzi beharko luke: <3, 5, 7, 9, 4> ");
    idatzi(Lis);
    New_Line;
    New_Line;
    New_Line;
    Eskatu_Return;
    Put_Line("Agur!!");

end proba_ngarren_pos;

