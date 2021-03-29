import React, { Component } from "react";
import styled, { css } from "styled-components";
import CupertinoSegmentWithThreeTabs1 from "../components/CupertinoSegmentWithThreeTabs1";

function ContactUs(props) {
  return (
    <>
      <CupertinoSegmentWithThreeTabs1
        style={{
          height: 56,
          marginTop: 8
        }}
      ></CupertinoSegmentWithThreeTabs1>
      <NVision2Row>
        <NVision2>NVision</NVision2>
        <Image1
          src={require("../assets/images/florida-gators-logo-black-and-white.png")}
        ></Image1>
      </NVision2Row>
      <LoremIpsumRow>
        <LoremIpsum>Please direct any questions to</LoremIpsum>
        <NvisionGmailCom>nvision@gmail.com</NvisionGmailCom>
      </LoremIpsumRow>
    </>
  );
}

const NVision2 = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 700;
  color: rgba(3,10,57,1);
  height: 119px;
  width: 433px;
  font-size: 120px;
  margin-top: 38px;
`;

const Image1 = styled.img`
  width: 100%;
  height: 226px;
  margin-left: 14px;
  object-fit: contain;
`;

const NVision2Row = styled.div`
  height: 226px;
  flex-direction: row;
  display: flex;
  margin-top: 156px;
  margin-left: 306px;
  margin-right: 305px;
`;

const LoremIpsum = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 400;
  color: rgba(0,0,0,1);
  font-size: 30px;
`;

const NvisionGmailCom = styled.span`
  font-family: Roboto;
  font-style: normal;
  font-weight: 400;
  color: rgba(62,179,185,1);
  font-size: 30px;
  text-decoration-line: underline;
  margin-left: 13px;
`;

const LoremIpsumRow = styled.div`
  height: 37px;
  flex-direction: row;
  display: flex;
  margin-top: 65px;
  margin-left: 340px;
  margin-right: 351px;
`;

export default ContactUs;
