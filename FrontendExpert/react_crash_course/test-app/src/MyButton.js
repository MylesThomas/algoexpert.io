import { memo } from 'react';

export default memo(function (props) {
    console.log('Rendering MyButton');

    const startTime = new Date();
    while (new Date() - startTime < 1000) {} // (This will make the page take 1 second every render)

    return <button {...props} style={{color: 'red'}} />;
});
