import '@css/App.css';

function App() {
  return (
    <>
      <div className="backgroundText">APPTIVE</div>
      <div className="partnerName">협력사 이름</div>
      <form className="searchInfo">
        <div className="searchInfo_title">고객 정보 조회</div>
        <div className="searchInfo_descript">이름과 전화번호를 통해 AS 정보를 불러올 수 있어요</div>
        <input type='text' placeholder='이름' className='searchInfo_input' id='input--name'></input>
        <input type='text' placeholder='전화번호' maxLength={14} className='searchInfo_input' id='input--phoneNum'></input>
        <input type='button' value={'조회하기'} className='searchInfo_input' id='input--btn'></input>
      </form>
    </>
  );
}

export default App;
