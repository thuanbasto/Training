CREATE DATABASE CungCap;
USE CungCap;
CREATE TABLE NHACUNGCAP(
	MaNhaCC char(10) not null ,
	TenNhaCC nvarchar(50),
	DiaChi nvarchar(50),
	SoDT nvarchar(15),
	MaSoThue nvarchar(15),
	PRIMARY KEY(MaNhaCC)
)
CREATE TABLE LOAIDICHVU(
	MaLoaiDV char(10) not null,
	TenLoaiDV nvarchar(50),
	PRIMARY KEY(MaLoaiDV)
)
CREATE TABLE MUCPHI(
	MaMP char(10) not null,
	DonGia int,
	MoTa nvarchar(50),
	PRIMARY KEY(MaMP)
)
CREATE TABLE DONGXE(
	DongXe varchar(200) not null ,
	HangXe nvarchar(20),
	SoChoNgoi int,
	PRIMARY KEY(DongXe)
)

create table DANGKICUNGCAP
(
  MaDKCC char(10) not null,
  MaNhaCC char(10),
  MaLoaiDV char(10) ,
  DongXe varchar(200),
  MaMP char(10),
  NgayBatDauCungCap  date,
  NgayKetThucCungCap date,
  SoLuongXeDangKi    int,
  primary key (MaDKCC),
  foreign key (MaNhaCC) references NHACUNGCAP(MaNhaCC),
  foreign key (MaLoaiDV) references LOAIDICHVU (MaLoaiDV),
  foreign key (DongXe) references DONGXE (DongXe),
  foreign key (MaMP) references MUCPHI (MaMP)
)

INSERT INTO NHACUNGCAP VALUES 
('NCC001', 'Cty TNHH Toan Phap', 'Hai Cau', '05113999888', '568941'),
('NCC002', 'Cty Co Phan Dong Du', 'Lien Chieu', '05113999889', '456789'),
 ('NCC003', 'Ong Nguyen Van A', 'Hoa Thuan', '05113999890', '321456'),
 ('NCC004', 'Cty Co Phan Toan Cau Xanh', 'Hai Chau', '05113658945', '513364'),
('NCC005', 'Cty TNHH AMA', 'Thanh Khe', '05113875466', '546546'),
 ('NCC006', ' Ba Tran Thi Bich Van', 'Lien Chieu', '05113587469', '524545'),
('NCC007', 'Cty TNHH Phan Thanh', 'Thanh Khe', '05113987456', '113021'),
 ('NCC008', 'Ong Phan Dinh Nam', 'Hoa Thuan', '05113432456', '121230'),
('NCC009', 'Tap Doan Dong Nam A', 'Lien Chieu', '05113987121', '533654'),
 ('NCC010', 'Cty Co Phan Rang Dong', 'Lien Chieu', '05113569654', '187864')

INSERT INTO LOAIDICHVU VALUES 
 ('DV01', 'Dich Vu Xe taxi'),
 ('DV02', 'Dich Vu Xe Buyt Cong Cong'),
 ('DV03', 'Dich Vu Xe Cho Thue Theo Hop Dong')

INSERT INTO MUCPHI VALUES 
 ('MP01', '10000', 'Ap Dung Tu 1/2015'),
 ('MP02', '15000', 'Ap Dung Tu 2/2015'),
 ('MP03', '20000', 'Ap Dung Tu 1/2010'),
 ('MP04', '25000', 'Ap Dung Tu 2/2011')

INSERT INTO DONGXE VALUES
 ('Hiace', 'Toyota', 16),
 ('Vios', 'Toyota', 5),
 ('Escape', 'Ford', 5),
 ('Cetaro', 'KIA', 7),
 ('Forte', 'KIA', 5),
 ('Starex', 'Huyndai', 7),
 ('Grand-i10', 'Huyndai', 7)

INSERT INTO DANGKICUNGCAP VALUES
 ('DK001', 'NCC001', 'DV01', 'Hiace', 'MP01', '11/20/2015', '11/20/2016', 4),
 ('DK002', 'NCC002', 'DV02', 'Vios', 'MP02', '11/20/2015', '11/20/2017', 3),
 ('DK003', 'NCC003', 'DV03', 'Escape', 'MP03', '11/20/2017', '11/20/2018', 5),
 ('DK004', 'NCC005', 'DV01', 'Cetaro', 'MP04', '11/20/2015', '11/20/2019', 7),
 ('DK005', 'NCC002', 'DV02', 'Forte', 'MP03', '11/20/2019', '11/20/2020', 1),
 ('DK006', 'NCC004', 'DV03', 'Starex', 'MP04', '11/10/2016', '11/20/2021', 2),
 ('DK007', 'NCC005', 'DV01', 'Cetaro', 'MP03', '11/30/2015', '01/25/2016', 8),
 ('DK008', 'NCC006', 'DV01', 'Vios', 'MP02', '02/28/2016', '08/15/2016', 9),
 ('DK009', 'NCC005', 'DV03', 'Grand-i10', 'MP02', '04/27/2016', '04/30/2017', 10),
 ('DK010', 'NCC006', 'DV01', 'Forte', 'MP02', '11/21/2015', '02/22/2017', 4),
 ('DK011', 'NCC007', 'DV01', 'Forte', 'MP01', '12/25/2016', '02/20/2017', 5),
 ('DK012', 'NCC007', 'DV03', 'Cetaro', 'MP01', '04/24/2016', '12/20/2017', 6),
 ('DK013', 'NCC003', 'DV02', 'Cetaro', 'MP01', '12/21/2015', '12/21/2016', 8),
 ('DK014', 'NCC008', 'DV02', 'Cetaro', 'MP01', '05/20/2016', '12/30/2016', 1),
 ('DK015', 'NCC003', 'DV01', 'Hiace', 'MP02', '04/24/2018', '11/20/2019', 6),
 ('DK016', 'NCC001', 'DV03', 'Grand-i10', 'MP02', '06/22/2016', '12/21/2016',8),
 ('DK017', 'NCC002', 'DV03', 'Cetaro', 'MP03', '09/30/2016', '09/20/2019', 4),
 ('DK018', 'NCC008', 'DV03', 'Escape', 'MP04', '12/13/2017', '09/20/2018', 2),
 ('DK019', 'NCC003', 'DV03', 'Escape', 'MP03', '01/24/2016', '12/30/2016', 8),
 ('DK020', 'NCC002', 'DV03', 'Cetaro', 'MP04', '05/03/2016', '10/21/2017', 7),
 ('DK021', 'NCC006', 'DV01', 'Forte', 'MP02', '01/30/2015', '12/30/2016', 9),
 ('DK022', 'NCC002', 'DV02', 'Cetaro', 'MP04', '07/25/2016', '12/30/2017', 6),
 ('DK023', 'NCC002', 'DV01', 'Forte', 'MP03', '11/30/2017', '05/20/2018', 5),
 ('DK024', 'NCC003', 'DV03', 'Forte', 'MP04', '12/23/2017', '11/30/2019', 8),
 ('DK025', 'NCC003', 'DV03', 'Hiace', 'MP02', '08/24/2016', '10/25/2017', 1)


 --cau 1
 --a
GO
CREATE VIEW T_NHACUNGCAP AS 
SELECT  ncc.MaNhaCC, ncc.TenNhaCC , ncc.DiaChi , ncc.SoDT,ncc.MaSoThue
FROM NHACUNGCAP ncc LEFT JOIN DANGKICUNGCAP dkcc ON ncc.MaNhaCC=dkcc.MaNhaCC
WHERE dkcc.NgayBatDauCungCap = '2015-11-20'
AND ncc.DiaChi = 'Lien Chieu'
WITH CHECK OPTION
go
--b
UPDATE T_NHACUNGCAP SET DiaChi='Thanh Khe'
WHERE DiaChi = 'Lien Chieu'

SELECT * FROM T_NHACUNGCAP


--cau 2
--a
GO
CREATE PROCEDURE Sp_1(
	@DongXe varchar(200)
)AS
BEGIN
	DELETE FROM DONGXE WHERE DongXe = @DongXe;
END;

EXECUTE Sp_1 @DongXe = 'Cetaro'

SELECT * FROM DONGXE

--b
SELECT * FROM DANGKICUNGCAP
GO
 CREATE PROCEDURE Sp_2(
	@MaDKCC nchar(10),
	@MaNhaCC nchar (10),
	@MaLoaiDV nchar(10),
	@DongXe nchar(10),
	@MaMP nchar(10),
	@NgayBatDauCungCap date,
	@NgayKetThucCungCap date,
	@SoLuongXeDangKy int
)
AS
BEGIN
	INSERT INTO DANGKICUNGCAP VALUES ('@MaDKCC', '@MaNhaCC', '@MaLoaiDV', '@DongXe', 'MaMP', '@NgayBatDauCungCap', '@NgayKetThucCungCap', '@SoLuongXeDangKy')
END

EXECUTE Sp_2
	@MaDKCC = 'DK025',
	@MaNhaCC = 'NCC003',
	@MaLoaiDV = 'DV03',
	@DongXe = 'Hiace',
	@MaMP = 'MP02',
	@NgayBatDauCungCap = '08/24/2016',
	@NgayKetThucCungCap = '10/25/2017',
	@SoLuongXeDangKy = 1
--cau3
--a
GO
CREATE TRIGGER Trigger_1
      ON DANGKICUNGCAP
      FOR DELETE
      AS
    BEGIN
      DECLARE
        @Tong int
      select @Tong = count(MaDKCC)
      from DANGKICUNGCAP
      print 'Số Đăng kí cung cấp còn : ' + CAST(@Tong as VARCHAR(20))
    END;
    /*Drop */
    DROP TRIGGER Trigger_1;
    /*Test*/
    SELECT count(MaDKCC)
    FROM DANGKICUNGCAP
    DELETE
    FROM DANGKICUNGCAP
    where MaDKCC = 'DK002';
--b
GO
CREATE TRIGGER Trigger_2
      ON DANGKICUNGCAP
      FOR UPDATE
      AS
      IF UPDATE(NgayBatDauCungCap) and UPDATE(NgayKetThucCungCap)
        DECLARE
          @Day int
    DECLARE
      @4year int
    SET @4year = 365 * 4
    SELECT @Day = DATEDIFF(day, NgayBatDauCungCap, NgayKetThucCungCap)
    from inserted
    IF (@Day > 0 and @Day < @4year)
      PRINT 'Update successfully !!'
    ELSE
      BEGIN
        print
            'Khoang thoi gian dang ky cung cap phuong tien tinh tu ngay bat dau cung cap den het ngay ket thuc cung cap phai nho hon 4 nam'
        ROLLBACK TRANSACTION
      END

    /*Drop*/
    DROP TRIGGER Trigger_2;
    /*Test*/
    UPDATE DANGKICUNGCAP
    SET NgayBatDauCungCap='2030-12-23'
    WHERE MaDKCC = 'DK011';

	select * from DANGKICUNGCAP

--4
--a
GO
CREATE FUNCTION func1(
	@MaMP nchar(10)
)
RETURNS INT
AS
BEGIN
	DECLARE @number INT;

	SELECT @number = COUNT(MaDKCC) FROM DANGKICUNGCAP WHERE MaMP = @MaMP;

	IF (@number IS NULL) SET @number = 0;

	RETURN @number;
END
GO
SELECT dbo.func1('MP01') AS NumberOfCars

--b
GO
CREATE FUNCTION func2(
	@MaNhaCC nchar(10)
)
RETURNS INT
AS
BEGIN
	DECLARE @max INT;

	SELECT @max = MAX(DATEDIFF(DAY, NgayBatDauCungCap, NgayKetThucCungCap)) FROM DANGKICUNGCAP WHERE MaNhaCC = @MaNhaCC;

	IF (@max IS NULL) SET @max = 0;

	RETURN @max
END
GO
SELECT dbo.func2('NCC001') AS MaxOfRent
