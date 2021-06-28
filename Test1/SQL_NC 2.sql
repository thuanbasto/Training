CREATE DATABASE ThuNuoii;
USE ThuNuoii;
CREATE TABLE CHUSOHUU(
 MaChuSH NCHAR(20) PRIMARY KEY NOT NULL,
 TenChuSH NVARCHAR(50),
 DiaChi NVARCHAR(50),
 SoDienThoai CHAR(10),
 );	

 CREATE TABLE LOAIVATNUOI(
 MaLoaiVN NCHAR(20) PRIMARY KEY NOT NULL,
 TenLoaiVN NVARCHAR(50),
 MoTaChiTiet NVARCHAR(100),
 );

 CREATE TABLE VATNUOI(
  MaVN NCHAR(20) PRIMARY KEY NOT NULL,
  MaChuSH NCHAR(20),
  MaLoaiVN NCHAR(20),
  TenVN NVARCHAR(50),
  CanNang INT,
  GioiTinh NCHAR(10),
  Tuoi INT,
  TienSuBenhLy NVARCHAR(50),
  MauLong NVARCHAR(50),
  TinhTrangSucKhoe NVARCHAR(50),
  CONSTRAINT FK_VATNUOI_CHUSOHUU FOREIGN KEY (MaChuSH) REFERENCES CHUSOHUU(MaChuSH),
  CONSTRAINT FK_VATNUOI_LOAIVATNUOI FOREIGN KEY (MaLoaiVN) REFERENCES LOAIVATNUOI(MaLoaiVN),
 );
 
 CREATE TABLE LOAIVACXIN(
  MaLoaiVX NCHAR(20) PRIMARY KEY NOT NULL,
  TenLoaiVX NVARCHAR(50),
  PhongBenh NVARCHAR(50),
  DieuKiemTiem NVARCHAR(100),
  LieuTrinhTiem NVARCHAR(50),
  LieuLuong REAL,
 );
 
 CREATE TABLE TIEMCHUNG(
  MaTC NCHAR(20) PRIMARY KEY NOT NULL,
  MaVN NCHAR(20),
  MaLoaiVX NCHAR(20),
  NgayTiem DATE,
  LanTiem INT,
  CONSTRAINT FK_TIEMCHUNG_VATNUOI FOREIGN KEY (MaVN) REFERENCES VATNUOI(MaVN),
  CONSTRAINT FK_TIEMCHUNG_LOAIVACXIN FOREIGN KEY (MaLoaiVX) REFERENCES LOAIVACXIN(MaLoaiVX),
 );

 INSERT INTO CHUSOHUU
 VALUES  ('SH001','Chu so huu 1','Hoa Hai','0905111111'),
         ('SH002','Chu so huu 2','Lien Chieu','0905111112'),
		 ('SH003','Chu so huu 3','Hai Chau','0905111113'),
		 ('SH004','Chu so huu 4','Hoa Minh','0905111114'),
		 ('SH005','Chu so huu 5','Hoa Hai','0905111115'),
		 ('SH006','Chu so huu 6','Hoa Xuan','0905111116'),
		 ('SH007','Chu so huu 7','Thanh Khe','0905111117'),
		 ('SH008','Chu so huu 8','Cam Le','0905111118'),
		 ('SH009','Chu so huu 9','Hoa Xuan','0905111119'),
		 ('SH010','Chu so huu 10','Hoa Hai','0905111120');

INSERT INTO LOAIVATNUOI
VALUES ('LVN01','Cho','Loai thich an thit'),
       ('LVN02','Meo','Loai an dong vat gay hai'),
	   ('LVN03','Chuot','Dong vat nho'),
	   ('LVN04','Chim','Dong vat co canh'),
	   ('LVN05','Soc','La dong vat nho');

INSERT INTO VATNUOI
VALUES ('VN001','SH001','LVN01','Husky','20','Duc','12','Duong ruot','den','Dam bao'),
       ('VN002','SH001','LVN01','Donerman','25','Cai','24','Khong','trang','Dam bao'),
	   ('VN003','SH003','LVN01','Alaskan','15','Duc','46','Khong','vang den','Dam bao'),
	   ('VN004','SH004','LVN01','ChowChow','30','Cai','24','Viem man tai','trang den','Dam bao'),
	   ('VN005','SH004','LVN02','MaineCoon','12','Duc','6','Viem mong','trang','Dam bao'),
	   ('VN006','SH004','LVN02','Ragdol','10','Cai','7','Khong','den','Dam bao'),
	   ('VN007','SH008','LVN02','Ba Tu','8','Duc','5','Khong','den trang','Dam bao'),
	   ('VN008','SH006','LVN02','Xiem','4','Cai','3','Nhiem sang','vang','Dam bao');

	   INSERT INTO VATNUOI
VALUES
	    ('VN002','SH001','LVN01','Donerman','25','Cai','24','Khong','trang','Dam bao'),
		('VN004','SH004','LVN01','ChowChow','30','Cai','24','Viem man tai','trang den','Dam bao');

INSERT INTO LOAIVACXIN
VALUES ('VX001','Vacxin 1','Cau trung','Duoi 1','Tiem 2 lan','1'),
       ('VX002','Vacxin 2','Thuong han','Tu 1 - 2','Tiem 1 lan','3'),
	   ('VX003','Vacxin 3','Dich ta','Duoi 1','Tiem 1 lan','1.5'),
	   ('VX004','Vacxin 4','Tu huyet','Duoi 1','Tiem 2 lan','2'),
	   ('VX005','Vacxin 5','Lo mom','Tu 2 - 3','Tiem 1 lan','1'),
	   ('VX006','Vacxin 6','Phe quan','Duoi 1','Uong 1 lan','1.5'),
	   ('VX007','Vacxin 7','Cat xon','1','Uong 1 lan','2'),
	   ('VX008','Vacxin 8','Tieu chay','1','Tiem 3 lan','1'),
	   ('VX009','Vacxin 9','Ho hap','1','Tiem 1 lan','1'),
	   ('VX010','Vacxin 10','Care','Duoi 1','Tiem 4 lan','3'),
	   ('VX011','Vacxin 11','Uong van','Tu 1 - 2 ','Uong 1 lan','1.5'),
	   ('VX012','Vacxin 12','Tai xanh','12','Uong 3 lan','2.5');

INSERT INTO TIEMCHUNG
VALUES ('TC0001','VN001','VX007','2016/11/20','3'),
       ('TC0002','VN001','VX006','2016/10/23','1'),
	   ('TC0003','VN005','VX010','2016/8/3','1'),
	   ('TC0004','VN005','VX011','2016/9/19','2'),
	   ('TC0005','VN005','VX011','2016/9/19','1'),
	   ('TC0006','VN007','VX001','2016/12/7','3'),
	   ('TC0007','VN007','VX002','2015/4/10','1'),
	   ('TC0008','VN008','VX003','2014/10/20','2'),
	   ('TC0009','VN008','VX002','2014/8/6','2'),
	   ('TC0010','VN008','VX001','2015/6/5','1'),
	   ('TC0011','VN003','VX008','2015/8/8','2'),
	   ('TC0012','VN003','VX008','2015/4/10','3'),
	   ('TC0013','VN001','VX006','2015/9/7','1'),
	   ('TC0014','VN001','VX007','2016/10/9','2'),
	   ('TC0015','VN003','VX007','2014/10/8','1');


/*----CAU 1A: ----*/
GO
CREATE VIEW V_Vacxin AS
SELECT LVX.*
FROM LOAIVACXIN AS LVX INNER JOIN TIEMCHUNG AS TC ON LVX.MaLoaiVX=TC.MaLoaiVX
WHERE LieuLuong=1;
GO
----Test View V_Vacxin
SELECT * FROM V_Vacxin;

----Xoa View
DROP VIEW V_Vacxin;

/*----CAU 1B: ----*/

UPDATE V_Vacxin
SET LieuLuong=4;

/*----CAU 2A: ----*/
GO
CREATE PROCEDURE Sp_1(@MaVN NCHAR(20))
AS
BEGIN
 UPDATE VATNUOI
 SET TinhTrangSucKhoe='Khong Dam bao'
 WHERE MaVN=@MaVN
END;
GO
---Test Procedure Sp_1
EXECUTE Sp_1 'VN008'

/*---- CAU 2B: ----*/
GO
CREATE PROC Sp_2(@MaTC NCHAR(20),
                 @MaVN NCHAR(20),
				 @MaLoaiVX NCHAR(20),
				 @NgayTiem Date,
				 @LanTiem int)
AS
BEGIN
  INSERT INTO TIEMCHUNG
  VALUES (@MaTC,@MaVN,@MaLoaiVX,@NgayTiem,@LanTiem)
END;
   
-----Test Procedure Sp_2
EXECUTE Sp_2 @MaTC='TC0016',@MaVN='VN001',@MaLoaiVX='VX007',@NgayTiem='2016/11/11',@LanTiem=1;

/*----- CAU 3A: -----*/
GO
CREATE TRIGGER Trigger_1
ON VATNUOI
FOR DELETE
AS 
BEGIN
 DECLARE @deleted INT
 SELECT @deleted=COUNT(*)
 FROM deleted
 PRINT 'The record number has been deleted: '+ CAST(@deleted AS NVARCHAR(20))
END;

----Test Trigger_1
DELETE FROM VATNUOI WHERE MaVN='VN002' OR MaVN='VN004' 

/*------CAU 3B -----*/
GO
CREATE TRIGGER Trigger_2
ON TIEMCHUNG
FOR INSERT
AS
 DECLARE @deference int
 DECLARE @day date
 DECLARE @lastday date
 DECLARE @ma NCHAR(20)
 ---/---
 SELECT @day=NgayTiem,@ma=MaVN
 FROM inserted 
 SELECT @lastday=MAX(NgayTiem)
 FROM TIEMCHUNG
 WHERE @ma=MaVN
 SET @deference=DATEDIFF(DAY,@day,@lastday)
 IF(@deference IS NULL)
 SET @deference=0
 IF(@deference < 30)
  PRINT 'Update successflly!'
 ELSE
  BEGIN
    PRINT 'thoi gian tiem phai nho hon thoi gian cua lan tiem chung cuoi cung (bat ke loai vacxin nao) caa vat nuoi it nhat 30 ngay'
	ROLLBACK TRANSACTION
  END;

------Test trigger_2

INSERT INTO TIEMCHUNG
VALUES ('TC0017','VN008','VX007','2018/12/6','3');
 
/*----- CAU 4A: -----*/
GO
CREATE FUNCTION funct1(@MaVN NVARCHAR(20))
RETURNS INT
AS
BEGIN
  DECLARE @number int
  SELECT @number=COUNT(LVX.MaLoaiVX)
  FROM (CHUSOHUU AS CSS INNER JOIN VATNUOI AS VN ON CSS.MaChuSH=VN.MaChuSH)
       INNER JOIN  TIEMCHUNG AS TC ON VN.MaVN=TC.MaVN INNER JOIN LOAIVACXIN AS LVX ON TC.MaLoaiVX=LVX.MaLoaiVX
  WHERE YEAR(NgayTiem) LIKE '2016' AND DiaChi LIKE 'Hoa hai' AND VN.MaVN=@MaVN
  RETURN @number 
END;
GO
---Test funct1
SELECT dbo.funct1('VN003') AS 'So luong duoc Tiem' 

/*------ CAU 4B: -----*/
GO
CREATE FUNCTION funct2(@TenLoaiVN NVARCHAR(50))
RETURNS INT
AS 
BEGIN
  DECLARE @number INT
  SELECT @number = COUNT(TC.MaVN)
  FROM TIEMCHUNG AS TC INNER JOIN VATNUOI AS VN ON TC.MaVN=VN.MaVN INNER JOIN LOAIVATNUOI AS LVN ON VN.MaLoaiVN=LVN.MaLoaiVN
  WHERE (NgayTiem BETWEEN '2014/1/1' AND'2016/12/31') AND @TenLoaiVN=TenLoaiVN
  GROUP BY TC.MaVN
  RETURN @number
END;
GO
-----Test funct2
SELECT dbo.funct2('Cho') as 'solan tiem nhieu nhat'

/*------ CAU 5: -----*/
GO
CREATE PROCEDURE Sp_TiemChung
AS
BEGIN
  DECLARE @Bangphu TABLE (MaVN NCHAR(20) NOT NULL)
  INSERT INTO @Bangphu(MaVN)
  SELECT TC.MaVN
  FROM VATNUOI AS VN INNER JOIN TIEMCHUNG AS TC ON TC.MaVN=VN.MaVN INNER JOIN LOAIVATNUOI AS LVN ON VN.MaLoaiVN=LVN.MaLoaiVN
  WHERE (YEAR(NgayTiem) BETWEEN '2014' AND '2016') AND TenLoaiVN='Cho'
  GROUP BY TC.MaVN
  HAVING COUNT(TC.MAVN)>2
  
  DELETE FROM TIEMCHUNG
  WHERE MaVN IN (SELECT MAVN FROM @Bangphu)

  DELETE FROM VATNUOI
  WHERE MaVN IN(SELECT MaVN FROM @Bangphu)
END;

----Test Proceducte Sp_TiemPhong
Execute Sp_TiemChung
