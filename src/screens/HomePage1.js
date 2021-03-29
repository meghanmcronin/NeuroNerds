import React, { Component } from "react";
import styled, { css } from "styled-components";
import CupertinoSegmentWithThreeTabs2 from "../components/CupertinoSegmentWithThreeTabs2";

function HomePage1(props) {
  return (
    <>
      <RectRow>
        <Rect>
          <Rect2></Rect2>
        </Rect>
        <LoremIpsum>100%</LoremIpsum>
      </RectRow>
      <LoremIpsum2Row>
        <LoremIpsum2>DICOM Files Downloaded!</LoremIpsum2>
        <Button>
          <ButtonOverlay>
            <ViewDicomData>VIEW DICOM DATA</ViewDicomData>
          </ButtonOverlay>
        </Button>
      </LoremIpsum2Row>
      <CupertinoSegmentWithThreeTabs1Stack>
        <CupertinoSegmentWithThreeTabs2
          style={{
            height: 56,
            position: "absolute",
            left: 0,
            top: 0,
            right: 0
          }}
        ></CupertinoSegmentWithThreeTabs2>
        <CupertinoSegmentWithThreeTabs2
          style={{
            height: 56,
            position: "absolute",
            left: 0,
            top: 0,
            right: 0
          }}
        ></CupertinoSegmentWithThreeTabs2>
      </CupertinoSegmentWithThreeTabs1Stack>
      <NVisionRow>
        <NVision>NVision</NVision>
        <Image1 src={require("../assets/images/ico.png")}></Image1>
      </NVisionRow>
      <LoremIpsum3>Patient Education App Information:</LoremIpsum3>
      <LoremIpsum4Row>
        <LoremIpsum4>
          While you&#39;re waiting, watch our Patient Education App Tutorial!
        </LoremIpsum4>
        <WwwYoutubeCom1>www.youtube.com</WwwYoutubeCom1>
      </LoremIpsum4Row>
    </>
  );
}

const Rect = styled.div`
  width: 700px;
  height: 64px;
  background-color: rgba(181,177,177,1);
  border-radius: 30px;
  flex-direction: column;
  display: flex;
`;

const ButtonOverlay = styled.button`
 display: block;
 background: none;
 height: 100%;
 width: 100%;
 border:none
 `;
const Rect2 = styled.div`
  width: 700px;
  height: 64px;
  background-color: rgba(0,122,255,1);
  border-radius: 33px;
`;

const LoremIpsum = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 700;
  color: #121212;
  font-size: 20px;
  margin-left: 10px;
  margin-top: 20px;
`;

const RectRow = styled.div`
  height: 64px;
  flex-direction: row;
  display: flex;
  margin-top: 434px;
  margin-left: 303px;
  margin-right: 304px;
`;

const LoremIpsum2 = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 400;
  color: #121212;
  font-size: 30px;
`;

const Button = styled.div`
  width: 191px;
  height: 37px;
  background-color: #E6E6E6;
  flex-direction: column;
  display: flex;
  margin-left: 105px;
  margin-top: 18px;
  border: none;
`;

const ViewDicomData = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 700;
  color: rgba(62,179,185,1);
  font-size: 20px;
  text-decoration-line: underline;
  margin-top: 7px;
  margin-left: 9px;
`;

const LoremIpsum2Row = styled.div`
  height: 55px;
  flex-direction: row;
  display: flex;
  margin-top: -169px;
  margin-left: 319px;
  margin-right: 406px;
`;

const CupertinoSegmentWithThreeTabs1Stack = styled.div`
  height: 56px;
  margin-top: -380px;
  position: relative;
`;

const NVision = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 700;
  color: rgba(3,10,57,1);
  height: 120px;
  width: 450px;
  font-size: 100px;
  margin-top: 16px;
`;

const Image1 = styled.img`
  width: 100%;
  height: 218px;
  margin-left: 11px;
  object-fit: contain;
`;

const NVisionRow = styled.div`
  height: 218px;
  flex-direction: row;
  display: flex;
  margin-top: 35px;
  margin-left: 319px;
  margin-right: 374px;
`;

const LoremIpsum3 = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 700;
  color: #121212;
  font-size: 25px;
  margin-top: 365px;
  margin-left: 498px;
`;

const LoremIpsum4 = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 400;
  color: #121212;
  font-size: 25px;
`;

const WwwYoutubeCom1 = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 700;
  color: rgba(62,179,185,1);
  font-size: 25px;
  text-decoration-line: underline;
  margin-left: 12px;
`;

const LoremIpsum4Row = styled.div`
  height: 30px;
  flex-direction: row;
  display: flex;
  margin-top: -125px;
  margin-left: 240px;
  margin-right: 218px;
`;

export default HomePage1;
