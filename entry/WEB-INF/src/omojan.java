package foo;
import java.util.Random;

public class Omojan{
  final static String[] words= new String[]{
    "���肾������","���q�l","�׈���","�h����","�^����","�ʎY�^","�V���[�g�R���g",
    "�X�i�t�L��","�̂����ɐ��ӋC��","�u���W���A","�񓿊w��","���������",
    "���߂�","�j�����ꂽ","�G���@���Q���I��","�헪��c","���","�ʂ�",
    "�f�W�^��","�����܂�","����","��","�J�X�e��","�c�`�m�R","�X�C�~���O",
    "��K","������","�A���[��","�s���~�b�h",
    };

  private String getSingleWord(){
    int index= new Random().nextInt(words.length);
    return words[index];
  }

  public String getWord(){
    return getSingleWord()+" "+getSingleWord();
  }
}
