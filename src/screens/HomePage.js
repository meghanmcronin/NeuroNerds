import React, { Component } from "react";
import styled, { css } from "styled-components";
import CircularProgress from "@material-ui/core/CircularProgress";
import CupertinoSegmentWithThreeTabs2 from "../components/CupertinoSegmentWithThreeTabs2";

function HomePage(props) {
  return (
    <>
      <LoremIpsum2Row>
        <LoremIpsum2>DICOM Files Downloading</LoremIpsum2>
        <CircularProgress
          style={{
            marginLeft: 15
          }}
        ></CircularProgress>
      </LoremIpsum2Row>
      <Rect>
        <Rect2Row>
          <Rect2></Rect2>
          <LoremIpsum>80%</LoremIpsum>
        </Rect2Row>
      </Rect>
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
      <NVisionStack>
        <NVision>NVision</NVision>
        <Image src={require("../assets/images/ico.png")}></Image>
      </NVisionStack>
      <LoremIpsum3Row>
        <LoremIpsum3>
          While you&#39;re waiting, watch our Patient Education App Tutorial!
        </LoremIpsum3>
        <WwwYoutubeCom>www.youtube.com</WwwYoutubeCom>
      </LoremIpsum3Row>
      <LoremIpsum4>Patient Education App Information:</LoremIpsum4>
    </>
  );
}

const LoremIpsum2 = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 400;
  color: #121212;
  font-size: 30px;
`;

const LoremIpsum2Row = styled.div`
  height: 40px;
  flex-direction: row;
  display: flex;
  margin-top: 319px;
  margin-left: 348px;
  margin-right: 618px;
`;

const Rect = styled.div`
  width: 700px;
  height: 64px;
  background-color: rgba(181,177,177,1);
  border-radius: 30px;
  flex-direction: row;
  display: flex;
  margin-top: 65px;
  margin-left: 333px;
`;

const Rect2 = styled.div`
  width: 525px;
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
  margin-left: 20px;
  margin-top: 20px;
`;

const Rect2Row = styled.div`
  height: 64px;
  flex-direction: row;
  display: flex;
  flex: 1 1 0%;
  margin-right: 117px;
`;

const CupertinoSegmentWithThreeTabs1Stack = styled.div`
  height: 56px;
  margin-top: -484px;
  position: relative;
`;

const NVision = styled.span`
  font-family: Roboto;
  top: 20px;
  left: 0px;
  position: absolute;
  font-style: normal;
  font-weight: 700;
  color: rgba(3,10,57,1);
  height: 120px;
  width: 450px;
  font-size: 100px;
`;

const Image = styled.img`
  top: 0px;
  left: 424px;
  width: 212px;
  height: 218px;
  position: absolute;
  object-fit: contain;
`;

const NVisionStack = styled.div`
  width: 636px;
  height: 218px;
  margin-top: 31px;
  margin-left: 348px;
  position: relative;
`;

const LoremIpsum3 = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 400;
  color: #121212;
  font-size: 25px;
`;

const WwwYoutubeCom = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 700;
  color: rgba(62,179,185,1);
  font-size: 25px;
  text-decoration-line: underline;
  margin-left: 12px;
`;

const LoremIpsum3Row = styled.div`
  height: 30px;
  flex-direction: row;
  display: flex;
  margin-top: 274px;
  margin-left: 240px;
  margin-right: 218px;
`;

const LoremIpsum4 = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 700;
  color: #121212;
  font-size: 25px;
  margin-top: 65px;
  margin-left: 498px;
`;

export default HomePage;
